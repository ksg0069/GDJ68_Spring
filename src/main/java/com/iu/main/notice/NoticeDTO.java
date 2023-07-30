package com.iu.main.notice;

import java.sql.Date;
import java.util.List;

public class NoticeDTO {
	
	private Long noticeNum;
	private String noticeName;
	private String noticeTitle;
	private String noticeContents;
	private Date noticeDate;
	private Long noticeHit;
	private List<NoticeFileDTO> fileDTOs;
	
	public List<NoticeFileDTO> getFileDTOs() {
		return fileDTOs;
	}
	public void setFileDTOs(List<NoticeFileDTO> fileDTOs) {
		this.fileDTOs = fileDTOs;
	}
	
	public Long getNoticeNum() {
		return noticeNum;
	}
	public void setNoticeNum(Long noticeNum) {
		this.noticeNum = noticeNum;
	}
	public String getNoticeName() {
		return noticeName;
	}
	public void setNoticeName(String noticeName) {
		this.noticeName = noticeName;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContents() {
		return noticeContents;
	}
	public void setNoticeContents(String noticeContents) {
		this.noticeContents = noticeContents;
	}
	public Date getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}
	public Long getNoticeHit() {
		return noticeHit;
	}
	public void setNoticeHit(Long noticeHit) {
		this.noticeHit = noticeHit;
	}

	
	
	
	
	
	
	

}
