package com.iu.main.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

@Repository
public class NoticeDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.main.notice.NoticeDAO.";

	//list
	public List<NoticeDTO> getList()throws Exception{
		
		return sqlSession.selectList(NAMESPACE+"getList");

	}
	
	//add
	public int setAdd(NoticeDTO noticeDTO) throws Exception{
		
		return sqlSession.insert(NAMESPACE+"setAdd",noticeDTO);
	
	}
	
	//detail
	
	public NoticeDTO getDetail(NoticeDTO noticeDTO)throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+"getDetail",noticeDTO);
			
			
		}
		
	//update
	
	public int setUpdate(NoticeDTO noticeDTO)throws Exception{
		
		return sqlSession.update(NAMESPACE+"setUpdate",noticeDTO);
	}
	
	//delete
	public int setDelete(NoticeDTO noticeDTO)throws Exception{
		
		return sqlSession.update(NAMESPACE+"setDelete",noticeDTO);
	}
	
	
	
	
	
	
	
	
	
	
}
