package com.iu.main.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.iu.main.member.MemberDAO.";
	
	public MemberDTO getLogin(MemberDTO memberDTO)throws Exception{ //mapper의 id와 동일하게 메서드 만듦
		return sqlSession.selectOne(NAMESPACE+"getLogin", memberDTO);
		
		
	}

	

}
