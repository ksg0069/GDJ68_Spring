package com.iu.main.bankBook;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.main.Mytest;

import junit.framework.Assert;

public class BankBookDAOTest extends Mytest {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	//dao중에 test할 메서드명사용
	@Test
	public void getList() throws Exception{	
	List<BankBookDTO> ar= bankBookDAO.getList();
	assertNotEquals(0, ar.size());
	
	
	
	
	
}
}
