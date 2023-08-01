package com.iu.main.board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.iu.main.board.BoardDAO;
import com.iu.main.board.BoardDTO;
import com.iu.main.board.notice.NoticeFileDTO;
import com.iu.main.util.Pager;

@Repository
public class QnaDAO implements BoardDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.iu.main.board.qna.QnaDAO.";
	
	//list
	public List<BoardDTO> getList(Pager pager)throws Exception{
		
		return sqlSession.selectList(NAMESPACE+"getList", pager); 
		
		
	}
	
	//total
	public Long getTotal(Pager pager)throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+"getTotal", pager);
	}

	//detail
	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.selectOne(NAMESPACE+"getDetail", boardDTO);
	}
	
	//fileAdd
	public int setFileAdd(QnaFileDTO qnaFileDTO) throws Exception{
		
		return sqlSession.insert(NAMESPACE+"setFileAdd", qnaFileDTO);
	
	} 

	//add
	@Override
	public int setAdd(BoardDTO boardDTO) throws Exception {
		
		return sqlSession.insert(NAMESPACE+"setAdd", boardDTO);
	}
	
	//QNA
	public int setReplyAdd(QnaDTO qnaDTO) throws Exception {
		
		return sqlSession.insert(NAMESPACE+"setReplyAdd", qnaDTO);
	}
	
	//step
	public int setStepUpdate(QnaDTO qnaDTO) throws Exception {
		
		return sqlSession.update(NAMESPACE+"setStepUpdate", qnaDTO);
	}
	

	//update
	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		
		return 0;
	}
	
	//delete
	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		
		return 0;
	}
	
	//hit
	@Override
	public int setHitUpdate(BoardDTO boardDTO) throws Exception {
		
		return 0;
	}
	
	

}
