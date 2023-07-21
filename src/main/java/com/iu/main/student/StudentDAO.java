package com.iu.main.student;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
	
	public List<StudentDTO> getDetail() throws Exception{
		
		return sqlSession.selectOne(NAMESPACE + "getDetail");
	}
	
	

}
