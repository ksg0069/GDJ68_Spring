package com.iu.main.bookComment;

import java.sql.Date;

public class BookCommentDTO {
	private Long num;
	private Long bookNum;
	private String id;
	private String contents;
	private Date createDate;
	
	
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public Long getBookNum() {
		return bookNum;
	}
	public void setBookNum(Long bookNum) {
		this.bookNum = bookNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
	

}
