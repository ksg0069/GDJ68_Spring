package com.iu.main.bookAccount;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookAccountDAO {
	
	@Autowired
	private SqlSession sqlsession;
	private final String NAMESPACE="com.iu.main.bookAccount.BookAccountDAO.";
	
	//list
	public List<BookAccountDTO> getList()throws Exception{
		
		return sqlsession.selectList(NAMESPACE+"getList");
	}
	
	//detail
	public BookAccountDTO getDetail(BookAccountDTO bookAccountDTO)throws Exception{
		
		return sqlsession.selectOne(NAMESPACE+"getDetail", bookAccountDTO);
	}
	
	//add
	public int setAdd(BookAccountDTO bookAccountDTO)throws Exception{
		
		return sqlsession.insert(NAMESPACE+"setAdd", bookAccountDTO);
	}
	
	//update
	public int setUpdate(BookAccountDTO bookAccountDTO)throws Exception{
		
		return sqlsession.insert(NAMESPACE+"setUpdate", bookAccountDTO);
	}
	
	//delete
	
	public int setDelete(BookAccountDTO bookAccountDTO)throws Exception{
		
		return sqlsession.insert(NAMESPACE+"setDelete", bookAccountDTO);
	}

	
}
