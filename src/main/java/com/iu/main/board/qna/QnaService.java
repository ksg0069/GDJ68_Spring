package com.iu.main.board.qna;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.main.bankBook.BankBookDAO;
import com.iu.main.board.BoardDTO;
import com.iu.main.board.BoardService;
import com.iu.main.util.Pager;

@Service
public class QnaService implements BoardService{
	
	@Autowired
	private QnaDAO qnaDAO;
	
	public List<BoardDTO> getList(Pager pager) throws Exception{
		
		
		pager.makeRowNum();
		Long total = qnaDAO.getTotal(pager);
		pager.makePageNum(total);
		
		return qnaDAO.getList(pager);
		
		
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		
		
		return qnaDAO.getDetail(boardDTO) ;
	}

	@Override
	public int setAdd(BoardDTO boardDTO, MultipartFile[] files, HttpSession session) throws Exception {
		
		return 0;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		
		return 0;
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		
		return 0;
	}
	
	

}
