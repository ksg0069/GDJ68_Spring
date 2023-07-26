package com.iu.main.notice;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.main.Mytest;
import com.iu.main.bankBook.BankBookDTO;


public class NoticeDAOTest extends Mytest{
	
	@Autowired
	private NoticeDAO noticeDAO;
	
//		@Test
//		public void getList() throws Exception{	
//			List<NoticeDTO> ar= noticeDAO.getList();
//			assertNotEquals(0, ar.size());
//	}
		
		@Test
		public void addTest() throws Exception{
			NoticeDTO noticeDTO = new NoticeDTO();
			for(int i=0; i<=30; i++) {
				noticeDTO.setNoticeName("강아지"+i);
				noticeDTO.setNoticeTitle("동물"+i);
				noticeDTO.setNoticeContents("푸들"+i);
				noticeDAO.setAdd(noticeDTO);
				
				
			}
	}
}


