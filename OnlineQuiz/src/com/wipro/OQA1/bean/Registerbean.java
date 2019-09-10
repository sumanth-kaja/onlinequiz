package com.wipro.OQA1.bean;

public class Registerbean 
{
	private String firstname;
	private String lastname;
	private String email;
	private String Registerid;
	private  String secretkey;
	private String password;
    private String accesstype;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Registerbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registerbean(String firstname, String lastname, String email, String registerid, String secretkey,
			String accesstype,String pwd) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		Registerid = registerid;
		this.secretkey = secretkey;
		this.accesstype = accesstype;
		password = pwd;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegisterid() {
		return Registerid;
	}
	public void setRegisterid(String registerid)
	{
		Registerid = registerid;
	}
	public String getSecretkey() {
		return secretkey;
	}
	public void setSecretkey(String secretkey) {
		this.secretkey = secretkey;
	}
	public String getAccesstype() {
		return accesstype;
	}
	public void setAccesstype(String accesstype) {
		this.accesstype = accesstype;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
}
