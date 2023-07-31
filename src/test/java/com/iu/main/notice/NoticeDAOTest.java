package com.iu.main.notice;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.main.Mytest;
import com.iu.main.bankBook.BankBookDTO;
import com.iu.main.board.notice.NoticeDAO;
import com.iu.main.board.notice.NoticeDTO;


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
			for(int i=0; i<30; i++) {
				noticeDTO.setName("안경"+i);
				noticeDTO.setSubject("안경1"+i);
				noticeDTO.setContents("안경2"+i);
				noticeDAO.setAdd(noticeDTO);
				
				
			}
	}
}


