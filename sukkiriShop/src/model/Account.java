package model;

import java.io.Serializable;

public class Account implements Serializable {
	private String userid; //ユーザーid
	private String pass; //パスワード
	private String mail; //メールアドレス
	private String name; //名前
	private int age; //年齢

	public Account() {
		}

	public Account(String userid, String pass, String mail, String name, int age) {
		super();
		this.userid = userid;
		this.pass = pass;
		this.mail = mail;
		this.name = name;
		this.age = age;
	}

	public String getUserId() {
		return userid;
	}

	public String getPass() {
		return pass;
	}

	public String getMail() {
		return mail;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
