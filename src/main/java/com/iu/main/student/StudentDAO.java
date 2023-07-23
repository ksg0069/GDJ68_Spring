package com.iu.main.student;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.main.bankBook.BankBookDTO;

@Repository
public class StudentDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE="com.iu.main.student.StudentDAO.";
	
	//List
	public List<StudentDTO> getList() throws Exception{
		
		return sqlSession.selectList(NAMESPACE + "getList");
	}
	//detail
	
	public StudentDTO getDetail(StudentDTO studentDTO) throws Exception{
		
		return sqlSession.selectOne(NAMESPACE + "getDetail", studentDTO);
	}
	
	//add
	public int setAdd(StudentDTO studentDTO)throws Exception{
		
		return sqlSession.insert(NAMESPACE+"setAdd", studentDTO);
	}
	
	//update
	public int setUpdate(StudentDTO studentDTO)throws Exception{
		
		return sqlSession.insert(NAMESPACE+"setUpdate", studentDTO);
	}
	
	//delete
	public int setDelete(StudentDTO studentDTO)throws Exception{
		
		return sqlSession.insert(NAMESPACE+"setDelete", studentDTO);
	}
	
	

}
