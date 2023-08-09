package com.iu.main.bookComment;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookCommentDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.iu.main.bookComment.BookCommentDAO.";
	
	public List<BookCommentDTO> getList(BookCommentDTO bookCommentDTO)throws Exception{
		return sqlSession.selectList(NAMESPACE+"getList",bookCommentDTO);
	}
}
