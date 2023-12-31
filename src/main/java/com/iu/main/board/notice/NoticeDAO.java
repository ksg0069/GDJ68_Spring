package com.iu.main.board.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iu.main.board.BoardDAO;
import com.iu.main.board.BoardDTO;
import com.iu.main.util.Pager;

@Repository
public class NoticeDAO implements BoardDAO{
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.main.board.notice.NoticeDAO.";

	

	
	//total
	public Long getTotal(Pager pager)throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+"getTotal", pager);
	}
	
	//list
	public List<BoardDTO> getList(Pager pager)throws Exception{
		
		return sqlSession.selectList(NAMESPACE+"getList",pager);

	}
	
	//파일업로드
	public int setFileAdd(NoticeFileDTO noticeFileDTO) throws Exception{
		
		return sqlSession.insert(NAMESPACE+"setFileAdd", noticeFileDTO);
	
	}
	
	
	//add
	public int setAdd(BoardDTO boardDTO) throws Exception{
		
		return sqlSession.insert(NAMESPACE+"setAdd",boardDTO);
	
	}
	
	//detail
	
	public BoardDTO getDetail(BoardDTO boardDTO)throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+"getDetail",boardDTO);
			
			
		}
		
	//update
	
	public int setUpdate(BoardDTO boardDTO)throws Exception{
		
		return sqlSession.update(NAMESPACE+"setUpdate",boardDTO);
	}
	
	//delete
	public int setDelete(BoardDTO boardDTO)throws Exception{
		
		return sqlSession.update(NAMESPACE+"setDelete",boardDTO);
	}
	//filedel
	public int setFileDelete(NoticeFileDTO noticeFileDTO)throws Exception{
		return sqlSession.delete(NAMESPACE+"setFileDelete", noticeFileDTO);
	}
	
	//file detail
	public NoticeFileDTO getFileDetail(NoticeFileDTO noticeFileDTO)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getFileDetail",noticeFileDTO);
	}

	@Override
	public int setHitUpdate(BoardDTO boardDTO) throws Exception {
		
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
