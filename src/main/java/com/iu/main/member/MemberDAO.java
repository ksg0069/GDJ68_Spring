package com.iu.main.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.iu.main.member.MemberDAO.";
	
	
	//파일업로드
	public int setFileJoin(MemberFileDTO memberFileDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setFileJoin", memberFileDTO);
	}
	
	//회원가입
	public int setJoin(MemberDTO memberDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setJoin",memberDTO);
	}
	
	//로그인
	public MemberDTO getLogin(MemberDTO memberDTO)throws Exception{ //mapper의 id가 메서드명과 동일하게
		return sqlSession.selectOne(NAMESPACE+"getLogin", memberDTO);
		
		
	}
	
	//업데이트
	public int setMemberUpdate(MemberDTO memberDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setMemberUpdate", memberDTO);
	}

	

}
