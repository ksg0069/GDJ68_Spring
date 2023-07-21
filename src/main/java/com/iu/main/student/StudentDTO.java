package com.iu.main.student;

public class StudentDTO {
	
	private Integer st_no;
	private String st_name;
	private Integer	kor;
	private Integer	eng;
	private Integer	math;
	private Integer	total;
	private Double avg;
	
	
	public Integer getSt_no() {
		return st_no;
	}
	public void setSt_no(Integer st_no) {
		this.st_no = st_no;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public Integer getKor() {
		return kor;
	}
	public void setKor(Integer kor) {
		this.kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = kor+eng+math;
	}
	public Double getAvg() {
		return avg;
	}
	public void setAvg(Double avg) {
		this.avg = (double)(total/3);
	}
	

}
