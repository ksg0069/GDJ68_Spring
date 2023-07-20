package com.iu.main.bankBook;


public class BankBookDTO {
	
	//null올수 있으므로 래퍼런스 타입입으로 만듬
	private Long bookNum;
	private String bookName;
	private Double bookRate;
	private Integer bookSale;
	private String bookContents;
	private String[] sports;
	
	public String[] getSports() {
		return sports;
	}
	public void setSports(String[] sports) {
		this.sports = sports;
	}
	public Long getBookNum() {
		return bookNum;
	}
	public void setBookNum(Long bookNum) {
		this.bookNum = bookNum;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookRate() {
		return bookRate;
	}
	public void setBookRate(Double bookRate) {
		this.bookRate = bookRate;
	}
	public Integer getBookSale() {
		return bookSale;
	}
	public void setBookSale(Integer bookSale) {
		this.bookSale = bookSale;
	}
	public String getBookContents() {
		return bookContents;
	}
	public void setBookContents(String bookContents) {
		this.bookContents = bookContents;
	}
	
	
}
