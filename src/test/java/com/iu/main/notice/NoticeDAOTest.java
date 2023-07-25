package com.iu.main.notice;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.main.Mytest;


public class NoticeDAOTest extends Mytest{
	
	@Autowired
	private NoticeDAO noticeDAO;
	
		@Test
		public void getList() throws Exception{	
			List<NoticeDTO> ar= noticeDAO.getList();
			assertNotEquals(0, ar.size());
	}
}


