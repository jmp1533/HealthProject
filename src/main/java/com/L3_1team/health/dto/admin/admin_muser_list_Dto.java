package com.L3_1team.health.dto.admin;

import java.sql.Timestamp;
import java.util.Date;

public class admin_muser_list_Dto {
	private String u_id;
	private String u_pwd;
	private int u_question;
	private String u_answer;
	private String u_name;
	private String u_img;
	private String u_phone;
	private String u_email;
	private String u_zipcode;
	private String u_addr;
	private String u_birth;
	private int u_gender;
	private int u_targetweight;
	private Timestamp u_regdate;
	private int u_out;

	public admin_muser_list_Dto() {
	}

	public admin_muser_list_Dto(String u_id, String u_pwd, int u_question, String u_answer, String u_name, String u_img,
			String u_phone, String u_email, String u_zipcode, String u_addr, String u_birth, int u_gender,
			int u_targetweight, Timestamp u_regdate, int u_out) {
		super();
		this.u_id = u_id;
		this.u_pwd = u_pwd;
		this.u_question = u_question;
		this.u_answer = u_answer;
		this.u_name = u_name;
		this.u_img = u_img;
		this.u_phone = u_phone;
		this.u_email = u_email;
		this.u_zipcode = u_zipcode;
		this.u_addr = u_addr;
		this.u_birth = u_birth;
		this.u_gender = u_gender;
		this.u_targetweight = u_targetweight;
		this.u_regdate = u_regdate;
		this.u_out = u_out;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public String getU_pwd() {
		return u_pwd;
	}

	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}

	public int getU_question() {
		return u_question;
	}

	public void setU_question(int u_question) {
		this.u_question = u_question;
	}

	public String getU_answer() {
		return u_answer;
	}

	public void setU_answer(String u_answer) {
		this.u_answer = u_answer;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_img() {
		return u_img;
	}

	public void setU_img(String u_img) {
		this.u_img = u_img;
	}

	public String getU_phone() {
		return u_phone;
	}

	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}

	public String getU_email() {
		return u_email;
	}

	public void setU_email(String u_email) {
		this.u_email = u_email;
	}

	public String getU_zipcode() {
		return u_zipcode;
	}

	public void setU_zipcode(String u_zipcode) {
		this.u_zipcode = u_zipcode;
	}

	public String getU_addr() {
		return u_addr;
	}

	public void setU_addr(String u_addr) {
		this.u_addr = u_addr;
	}

	public String getU_birth() {
		return u_birth;
	}

	public void setU_birth(String u_birth) {
		this.u_birth = u_birth;
	}

	public int getU_gender() {
		return u_gender;
	}

	public void setU_gender(int u_gender) {
		this.u_gender = u_gender;
	}

	public int getU_targetweight() {
		return u_targetweight;
	}

	public void setU_targetweight(int u_targetweight) {
		this.u_targetweight = u_targetweight;
	}

	public Timestamp getU_regdate() {
		return u_regdate;
	}

	public void setU_regdate(Timestamp u_regdate) {
		this.u_regdate = u_regdate;
	}

	public int getU_out() {
		return u_out;
	}

	public void setU_out(int u_out) {
		this.u_out = u_out;
	}

}
