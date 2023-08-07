package com.iu.main.bookAccount;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.main.Mytest;
import com.iu.main.board.notice.NoticeDTO;
import com.iu.main.member.MemberDAO;
import com.iu.main.member.MemberDTO;

public class BookAccoutDAOTest extends Mytest{

	@Autowired
	private BookAccountDAO bookAccountDAO;
	
//	@Test
//	public void getList() throws Exception{	
//		MemberDTO memberDTO = new MemberDTO();
//		memberDTO.setId("ksg");
//		
//		List<BookAccountDTO> ar= bookAccountDAO.getList(memberDTO);
//		assertEquals(0, ar.size());
//}
	

	@Test
	public void addTest() throws Exception{
		BookAccountDTO bookAccountDTO = new BookAccountDTO();
			Calendar ca = Calendar.getInstance(); 
			long result = ca.getTimeInMillis();
			
			
			bookAccountDTO.setId("ksg9797");
			bookAccountDTO.setBookNum(193L);
			bookAccountDTO.setAccount(result);
			bookAccountDTO.setAccountPassword("0657");
			bookAccountDTO.setAccountBalance(0L);
			int result1 = bookAccountDAO.setAdd(bookAccountDTO);
			
			assertNotEquals(0, result1);
		    
			
			
}
	
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
	
//	@Test
//	public void detailTest() throws Exception{
//		BookAccountDTO bookAccountDTO = new BookAccountDTO();
//	
//			bookAccountDTO.setAccountNum(1l);
//			
//			bookAccountDTO = bookAccountDAO.getDetail(bookAccountDTO);
//			assertNotEquals(0, bookAccountDTO);
//			
//}
}
