package com.iu.main.bookComment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookCommentService {
	
	@Autowired
	private BookCommentDAO bookCommentDAO;
	
	public List<BookCommentDTO> getList(BookCommentDTO bookCommentDTO)throws Exception{
		
		return bookCommentDAO.getList(bookCommentDTO);
	}

}
