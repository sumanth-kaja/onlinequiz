package com.wipro.OQA1.bean;

public class LoginBean 
{
	
		private String id;
		private String passwd;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPasswd() {
			return passwd;
		}
		public void setPasswd(String passwd) {
			this.passwd = passwd;
		}
		public LoginBean(String id, String passwd) {
			super();
			this.id = id;
			this.passwd = passwd;
		}
		public LoginBean() {
			super();
			// TODO Auto-generated constructor stub
		}
}
