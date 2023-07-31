package com.iu.main.qna;

import java.sql.Date;

public class QnaDTO {
	
	private Long qnaNum;
	private String qnaName;
	private String qnaTitle;
	private String qnaContents;
	private Date qnaDate;
	private Long qnaHit;
	private Long qnaRef;
	private Long qnaStep;
	private Long qnaDepth;
	
	public Long getQnaNum() {
		return qnaNum;
	}
	public void setQnaNum(Long qnaNum) {
		this.qnaNum = qnaNum;
	}
	public String getQnaName() {
		return qnaName;
	}
	public void setQnaName(String qnaName) {
		this.qnaName = qnaName;
	}
	public String getQnaTitle() {
		return qnaTitle;
	}
	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}
	public String getQnaContents() {
		return qnaContents;
	}
	public void setQnaContents(String qnaContents) {
		this.qnaContents = qnaContents;
	}
	public Date getQnaDate() {
		return qnaDate;
	}
	public void setQnaDate(Date qnaDate) {
		this.qnaDate = qnaDate;
	}
	public Long getQnaHit() {
		return qnaHit;
	}
	public void setQnaHit(Long qnaHit) {
		this.qnaHit = qnaHit;
	}
	public Long getQnaRef() {
		return qnaRef;
	}
	public void setQnaRef(Long qnaRef) {
		this.qnaRef = qnaRef;
	}
	public Long getQnaStep() {
		return qnaStep;
	}
	public void setQnaStep(Long qnaStep) {
		this.qnaStep = qnaStep;
	}
	public Long getQnaDepth() {
		return qnaDepth;
	}
	public void setQnaDepth(Long qnaDepth) {
		this.qnaDepth = qnaDepth;
	}
	
	
	

}
