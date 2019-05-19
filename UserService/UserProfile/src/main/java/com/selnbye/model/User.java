package com.selnbye.model;

public class User {

	private int cid;
	private String fname;
	private String lname;
	private String email;
	private String phone;
	
	//get methods
	public int getcid() {
		return cid;
	}

	public String getfname() {
		return fname;
	}
	
	public String getlname() {
		return lname;
	}
	
	public String getemail() {
		return email;
	}
	
	public String getphone() {
		return phone;
	}
	
	
	//set methods
	public void setcid(int cid) {
		this.cid = cid;
	}
	
	public void setfname(String fname) {
		this.fname = fname;
	}
	
	public void setlname(String lname) {
		this.lname = lname;
	}
	
	public void setemail(String email) {
		this.email = email;
	}
	
	public void setphone(String phone) {
		this.phone = phone;
	}
}
