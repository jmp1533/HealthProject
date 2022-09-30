package com.L3_1team.health.dto.client.user;

import java.sql.Timestamp;

public class TrainerDto {
	private String t_id;
	private String t_pwd;
	private String t_name;
	private String zipcode;
	private String t_addr;
	private String t_company;
	private String t_phone;
	private String t_birth;
	private String t_email;
	private String t_img;
	private int t_question;
	private String t_answer;
	private int t_gender;
	private float t_weight;
	private float t_height;
	private String t_introduction;
	private Timestamp t_date;
	private int t_condition;

	public TrainerDto() {
	}

	public TrainerDto(String t_id, String t_pwd, String t_name, String zipcode, String t_addr, String t_company,
			String t_phone, String t_birth, String t_email, String t_img, int t_question, String t_answer, int t_gender,
			float t_weight, float t_height, String t_introduction, Timestamp t_date, int t_condition) {
		super();
		this.t_id = t_id;
		this.t_pwd = t_pwd;
		this.t_name = t_name;
		this.zipcode = zipcode;
		this.t_addr = t_addr;
		this.t_company = t_company;
		this.t_phone = t_phone;
		this.t_birth = t_birth;
		this.t_email = t_email;
		this.t_img = t_img;
		this.t_question = t_question;
		this.t_answer = t_answer;
		this.t_gender = t_gender;
		this.t_weight = t_weight;
		this.t_height = t_height;
		this.t_introduction = t_introduction;
		this.t_date = t_date;
		this.t_condition = t_condition;
	}

	public String getT_id() {
		return t_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}

	public String getT_pwd() {
		return t_pwd;
	}

	public void setT_pwd(String t_pwd) {
		this.t_pwd = t_pwd;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getT_addr() {
		return t_addr;
	}

	public void setT_addr(String t_addr) {
		this.t_addr = t_addr;
	}

	public String getT_company() {
		return t_company;
	}

	public void setT_company(String t_company) {
		this.t_company = t_company;
	}

	public String getT_phone() {
		return t_phone;
	}

	public void setT_phone(String t_phone) {
		this.t_phone = t_phone;
	}

	public String getT_birth() {
		return t_birth;
	}

	public void setT_birth(String t_birth) {
		this.t_birth = t_birth;
	}

	public String getT_email() {
		return t_email;
	}

	public void setT_email(String t_email) {
		this.t_email = t_email;
	}

	public String getT_img() {
		return t_img;
	}

	public void setT_img(String t_img) {
		this.t_img = t_img;
	}

	public int getT_question() {
		return t_question;
	}

	public void setT_question(int t_question) {
		this.t_question = t_question;
	}

	public String getT_answer() {
		return t_answer;
	}

	public void setT_answer(String t_answer) {
		this.t_answer = t_answer;
	}

	public int getT_gender() {
		return t_gender;
	}

	public void setT_gender(int t_gender) {
		this.t_gender = t_gender;
	}

	public float getT_weight() {
		return t_weight;
	}

	public void setT_weight(float t_weight) {
		this.t_weight = t_weight;
	}

	public float getT_height() {
		return t_height;
	}

	public void setT_height(float t_height) {
		this.t_height = t_height;
	}

	public String getT_introduction() {
		return t_introduction;
	}

	public void setT_introduction(String t_introduction) {
		this.t_introduction = t_introduction;
	}

	public Timestamp getT_date() {
		return t_date;
	}

	public void setT_date(Timestamp t_date) {
		this.t_date = t_date;
	}

	public int getT_condition() {
		return t_condition;
	}

	public void setT_condition(int t_condition) {
		this.t_condition = t_condition;
	}

	@Override
	public String toString() {
		return "TrainerDto [t_id=" + t_id + ", t_pwd=" + t_pwd + ", t_name=" + t_name + ", zipcode=" + zipcode
				+ ", t_addr=" + t_addr + ", t_company=" + t_company + ", t_phone=" + t_phone + ", t_birth=" + t_birth
				+ ", t_email=" + t_email + ", t_img=" + t_img + ", t_question=" + t_question + ", t_answer=" + t_answer
				+ ", t_gender=" + t_gender + ", t_weight=" + t_weight + ", t_height=" + t_height + ", t_introduction="
				+ t_introduction + ", t_date=" + t_date + ", t_condition=" + t_condition + "]";
	}
}
