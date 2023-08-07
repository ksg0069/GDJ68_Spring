package com.iu.main.bookAccount;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.main.member.MemberDTO;
import com.iu.main.util.Pager;

@Repository
public class BookAccountDAO {
	
	@Autowired
	private SqlSession sqlsession;
	private final String NAMESPACE="com.iu.main.bookAccount.BookAccountDAO.";
	
	//total
	public Long getTotal()throws Exception{
		return sqlsession.selectOne(NAMESPACE+"getTotal");
	}
	
	//list
	public List<BookAccountDTO> getList(Map<String, Object> map)throws Exception{
		
		return sqlsession.selectList(NAMESPACE+"getList", map);
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
