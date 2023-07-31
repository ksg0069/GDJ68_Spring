package com.iu.main.board;

import java.util.List;

import com.iu.main.util.Pager;

public interface BoardDAO {
	
	//List
	public List<BoardDTO> getList(Pager pager)throws Exception;
		
	//detail
	public BoardDTO getDetail(BoardDTO boardDTO)throws Exception ;
		
	//add
	public int setAdd(BoardDTO boardDTO)throws Exception;
	
	//update
	public int setUpdate(BoardDTO boardDTO)throws Exception;
	
	//delete
	public int setDelete(BoardDTO boardDTO)throws Exception;
	
	//totalCount
	public Long getTotal(Pager pager)throws Exception;

	//조회수 업데이트
	public int setHitUpdate(BoardDTO boardDTO)throws Exception;
	

}
