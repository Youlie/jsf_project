package com.aplose.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginManageBean {

	private String passWord;
	private String login;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String toLogin() {
		if (login.equals("boubou")&&passWord.equals("boubou")) {
			return "welcome";
		}
		return "error";
	}
}
