package com.iu.main.bookAccount;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.main.Mytest;
import com.iu.main.board.notice.NoticeDTO;

public class BookAccoutDAOTest extends Mytest{

	@Autowired
	private BookAccountDAO bookAccountDAO;
	
//	@Test
//	public void getList() throws Exception{	
//		List<BookAccountDTO> ar= bookAccountDAO.getList();
//		assertNotEquals(0, ar.size());
//}

//	@Test
//	public void addTest() throws Exception{
//		BookAccountDTO bookAccountDTO = new BookAccountDTO();
//			Calendar ca = Calendar.getInstance(); 
//			long result = ca.getTimeInMillis();
//			
//			
//			bookAccountDTO.setId("ksg");
//			bookAccountDTO.setBookNum(240L);
//			bookAccountDTO.setAccount(result);
//			bookAccountDTO.setAccountPassword(145);
//			bookAccountDTO.setAccountBalance(10000400l);
//			bookAccountDAO.setAdd(bookAccountDTO);
//			
//			
//}
	
//	@Test
//	public void updateTest() throws Exception{
//		BookAccountDTO bookAccountDTO = new BookAccountDTO();
//			Calendar ca = Calendar.getInstance(); 
//			long result = ca.getTimeInMillis();
//			
//			
//		
//			bookAccountDTO.setAccountNum(1l);
//			bookAccountDTO.setAccount(result);
//			bookAccountDTO.setAccountPassword(1456);
//			bookAccountDTO.setAccountBalance(10000400l);
//			bookAccountDAO.setUpdate(bookAccountDTO);
//			
//			
//}
	
//	@Test
//	public void deleteTest() throws Exception{
//		BookAccountDTO bookAccountDTO = new BookAccountDTO();
//	
//			
//			bookAccountDTO.setAccountNum(1l);
//		
//			bookAccountDAO.setDelete(bookAccountDTO);
//			
//			
//}
	
	@Test
	public void detailTest() throws Exception{
		BookAccountDTO bookAccountDTO = new BookAccountDTO();
	
			bookAccountDTO.setAccountNum(1l);
			
			bookAccountDTO = bookAccountDAO.getDetail(bookAccountDTO);
			assertNotEquals(0, bookAccountDTO);
			
}
}
