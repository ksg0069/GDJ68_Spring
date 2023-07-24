package com.iu.main.bankBook;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.main.Mytest;

public class BankBookDAOTest extends Mytest {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	@Test
	public void getList() throws Exception{
		
	List<BankBookDTO> bankBookDTOs = bankBookDAO.getList();
	
	
	
	
}
}
