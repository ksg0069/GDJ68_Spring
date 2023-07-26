package com.iu.main.bankBook;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.main.Mytest;

import junit.framework.Assert;

public class BankBookDAOTest extends Mytest {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	//dao중에 test할 메서드명사용
//	@Test
//	public void getList() throws Exception{	
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("startRow",11);
//		map.put("lastRow",20);
//		
//		List<BankBookDTO> ar = bankBookDAO.getList(map);
//		System.out.println(ar.get(0).getBookNum());
//		System.out.println(ar.get(9).getBookNum());
//	}
	
	//@Test
	public void addTest() throws Exception{
		BankBookDTO bankBookDTO = new BankBookDTO();
		for(int i=0; i<30; i++) {
			bankBookDTO.setBookName("도토리"+i);
			bankBookDTO.setBookContents("도토리 내용"+i);
			bankBookDTO.setBookRate(2.3);
			bankBookDTO.setBookSale(1);
			bankBookDAO.setAdd(bankBookDTO);
		}
		
		
		System.out.println("끝");
	}
}
