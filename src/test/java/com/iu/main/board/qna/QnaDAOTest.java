package com.iu.main.board.qna;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.main.Mytest;
import com.iu.main.board.BoardDTO;


public class QnaDAOTest extends Mytest{

	@Autowired
	private QnaDAO qnaDAO;

	@Test
	public void setAddTest()throws Exception{
		
		QnaDTO boardDTO = new QnaDTO();
		
		for(int i=0; i<30; i++) {
		boardDTO.setName("ksg");
		boardDTO.setSubject("apple"+i);
		boardDTO.setContents("agasdf"+i);
		qnaDAO.setAdd(boardDTO);
		}
		int result = qnaDAO.setAdd(boardDTO);
		assertEquals(1, result);
	}
}
