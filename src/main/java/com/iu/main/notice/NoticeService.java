package com.iu.main.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	//list
	public List<NoticeDTO> getList() throws Exception{
		
		return noticeDAO.getList();
	}
	
	//add
	public int setAdd(NoticeDTO noticeDTO) throws Exception{
		
		return noticeDAO.setAdd(noticeDTO);
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
