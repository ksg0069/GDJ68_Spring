package com.iu.main.bankBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.main.bookComment.BookCommentDTO;
import com.iu.main.member.MemberFileDTO;
import com.iu.main.util.Pager;

@Repository // 해당 클래스의 객체 생성
public class BankBookDAO {
	
	@Autowired
	private SqlSession sqlSession; // database-context.xml을 주입받음 , mapper들의 위치(어느 mapper쓸건지 모름),db연결
	
	private final String NAMESPACE="com.iu.main.bankBook.BankBookDAO.";  //mapper의 namespace와 동일한 이름
	
	
	//------- Comment
	
	//insert
	public int setCommentAdd(BookCommentDTO bookCommentDTO)throws Exception{
	
		return sqlSession.insert(NAMESPACE+"setCommentAdd",bookCommentDTO);
	}
	
		public long getCommentTotal(BookCommentDTO bookCommentDTO)throws Exception{
			return sqlSession.selectOne(NAMESPACE+"getCommentTotal", bookCommentDTO);
		}
		public List<BookCommentDTO> getCommentList(Map<String, Object> map)throws Exception{
			return sqlSession.selectList(NAMESPACE+"getCommentList", map);
		}
	
	
	
	//total
	public Long getTotal(Pager pager)throws Exception{//id와 동일한 메서드명 작성
		
		return sqlSession.selectOne(NAMESPACE+"getTotal", pager);
		
	}
	
	//List
	public List<BankBookDTO> getList(Pager pager)throws Exception{
		
		return sqlSession.selectList(NAMESPACE+"getList", pager);
		
	}
	
	//detail
	
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception{
		
		return sqlSession.selectOne(NAMESPACE + "getDetail", bankBookDTO); //selectOne select에서 보낼 때, 어느매퍼의 어느아이디, 파라미터로 dto를받으므로 
	}//컬럼명과 세터의 이름이 이름이 일치하는것에 dto를 넣어줌
	//add
	
	public int setAdd(BankBookDTO bankBookDTO) throws Exception{
		
		return sqlSession.insert(NAMESPACE + "setAdd", bankBookDTO);
		
	}
	
	//fileAdd
	public int setFileAdd(BankBookFileDTO bankBookFileDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setFileAdd",bankBookFileDTO );
	}
	
//	public long getSequence() throws Exception{
//		return sqlSession.selectOne(NAMESPACE+"getSequence");
//	}
	

	//update
	public int setUpdate(BankBookDTO bankBookDTO)throws Exception{
		return sqlSession.update(NAMESPACE+ "setUpdate", bankBookDTO);
	}
	//delete
	
	public int setDelete(Long num)throws Exception{
		return sqlSession.delete(NAMESPACE+ "setDelete", num);
	}

}
