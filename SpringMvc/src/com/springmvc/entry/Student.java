package com.springmvc.entry;

public class Student {

	private String name;
	private String addr;
	private String tel;
	private Banji banji;
	
	public Banji getBanji() {
		return banji;
	}
	public void setBanji(Banji banji) {
		this.banji = banji;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", addr=" + addr + ", tel=" + tel + ", banji=" + banji + "]";
	}
	
	
	
}
