package com.iu.main.bankBook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.main.bookComment.BookCommentDTO;
import com.iu.main.member.MemberDAO;
import com.iu.main.util.FileManger;
import com.iu.main.util.Pager;

@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	@Autowired
	private FileManger fileManger;
	
	//--- Comment
	
		public List<BookCommentDTO> getCommentList(Pager pager, BookCommentDTO bookCommentDTO)throws Exception{
			Map<String, Object> map = new HashMap<String, Object>();
			pager.makeRowNum();
			pager.makePageNum(bankBookDAO.getCommentTotal(bookCommentDTO));
			map.put("pager", pager);
			map.put("comment", bookCommentDTO);
			
			return bankBookDAO.getCommentList(map);
		}
	
	public List<BankBookDTO> getList(Pager pager)throws Exception{
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		//page		startRow		lastRow
//		//1			1				10
//		//2			11			 	20
//		//...
//		
//		int count =10;
//		int startRow =(page-1)*count+1;
//		int lastRow = page*count;
		pager.makeRowNum();  // heap영역에 생성됨 pager의 주소가 같으므로 
		Long total = bankBookDAO.getTotal(pager);
		pager.makePageNum(total);
//		map.put("startRow", startRow);
//		map.put("lastRow", lastRow);
		return bankBookDAO.getList(pager); //파라미터 없음
		
	}
	
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.getDetail(bankBookDTO);
	}
	
	public int setAdd(BankBookDTO bankBookDTO, MultipartFile [] files, HttpSession session) throws Exception{
		// /resources/upload/bankbook/
		String path = "/resources/upload/bankbook/";
//		long num = bankBookDAO.getSequence();
//		bankBookDTO.setBookNum(num);
		
		int result = bankBookDAO.setAdd(bankBookDTO);
		
		if(files.length!=0) {
			for(int i=0; i<files.length; i++) {
	
			String fileName =fileManger.fileSave(path, files[i], session);
			BankBookFileDTO bankBookFileDTO = new BankBookFileDTO();
			bankBookFileDTO.setOriginalName(files[i].getOriginalFilename());
			bankBookFileDTO.setFileName(fileName);
			bankBookFileDTO.setBookNum(bankBookDTO.getBookNum());
			result = bankBookDAO.setFileAdd(bankBookFileDTO);
			}
		}
		
		
		return result;
	}
	
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception{
		return bankBookDAO.setUpdate(bankBookDTO);
	}
	
	public int setDelete(Long num)throws Exception{
		return bankBookDAO.setDelete(num);
	}

}
