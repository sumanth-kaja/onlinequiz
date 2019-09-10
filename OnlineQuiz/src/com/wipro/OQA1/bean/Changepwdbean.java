package com.wipro.OQA1.bean;

public class Changepwdbean 
{
	private String RegId;
	private String old_password;
	private String new_password;
	public String getRegId() {
		return RegId;
	}
	public void setRegId(String regId) {
		RegId = regId;
	}
	public String getNew_password() {
		return new_password;
	}
	public void setNew_password(String new_password) {
		this.new_password = new_password;
	}
	public String getOld_password() {
		return old_password;
	}
	public void setOld_password(String old_password) {
		this.old_password = old_password;
	}
	public Changepwdbean(String regId, String new_password,String old_password) {
		super();
		RegId = regId;
		this.new_password = new_password;
		this.old_password=old_password;
	}
	
	public Changepwdbean() {
		super();
	}

}
