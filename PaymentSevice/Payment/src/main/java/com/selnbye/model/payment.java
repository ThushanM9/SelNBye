package com.selnbye.model;

public class payment {
	
	private int pid;
	private String fname;
	private String lname;
	private String cardno;
	private String cdate;
	private String ccv;
	
	public payment() {}
		public payment(int pid,String fname, String lname, String cardno, String cdate, String ccv ) {
			super();
			this.pid = pid;
			this.fname = fname;
			this.lname = lname;
			this.cardno = cardno;
			this.cdate = cdate;
			this.ccv = ccv;
		}
	
	
	//get methods
	public int getpid() {
		return pid;
	}

	public String getfname() {
		return fname;
	}
	
	public String getlname() {
		return lname;
	}
	
	public String getcardno() {
		return cardno;
	}
	
	public String getcdate() {
		return cdate;
	}
	
	public String getccv() {
		return ccv;
	}
	
	//get methods
	public void setpid(int pid) {
		this.pid = pid;
	}
	
	public void setfname(String fname) {
		this.fname = fname;
	}
	
	public void setlname(String lname) {
		this.lname = lname;
	}
	
	public void setcardno(String cardno) {
		this.cardno = cardno;
	}
	
	public void setcdate(String cdate) {
		this.cdate = cdate;
	}
	
	public void setccv(String ccv) {
		this.ccv = ccv;
	}
	
}
