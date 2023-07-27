package com.iu.main.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.main.util.Pager;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	//list
	public List<NoticeDTO> getList(Pager pager) throws Exception{
		
		pager.makeRowNum();
		Long total = noticeDAO.getTotal(pager);
		pager.makePageNum(total);
		return noticeDAO.getList(pager);
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
