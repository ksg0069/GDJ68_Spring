package com.iu.main.notice;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.main.util.FileManger;
import com.iu.main.util.Pager;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Autowired
	private FileManger fileManger;
	
	//list
	public List<NoticeDTO> getList(Pager pager) throws Exception{
		
		pager.makeRowNum();
		Long total = noticeDAO.getTotal(pager);
		pager.makePageNum(total);
		return noticeDAO.getList(pager);
	}
	
	//add
	public int setAdd(NoticeDTO noticeDTO, MultipartFile[] files, HttpSession session) throws Exception{
		
		String path = "/resources/upload/board/";
		
		int result = noticeDAO.setAdd(noticeDTO);
		
		for(MultipartFile multipartFile: files) {
			
			if(multipartFile.isEmpty()) {
				continue;
			}
			
			String fileName = fileManger.fileSave(path, multipartFile, session);
			NoticeFileDTO noticeFileDTO = new NoticeFileDTO();
			noticeFileDTO.setOriginalName(multipartFile.getOriginalFilename());
			noticeFileDTO.setFileName(fileName);
			noticeFileDTO.setNoticeNum(noticeDTO.getNoticeNum());
			result = noticeDAO.setFileAdd(noticeFileDTO);
		}
		
		return result;
	}
	
	//detail
	public NoticeDTO getDetail(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.getDetail(noticeDTO);
				
	}
	
	//update
	public int setUpdate(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.setUpdate(noticeDTO);
				
	}
	
	//delete
	public int setDelete(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.setDelete(noticeDTO);
				
	}

}
