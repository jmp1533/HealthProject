package com.L3_1team.health.dto.client.menu;

import java.sql.Timestamp;

public class Mypage_management_Dto {
	private String t_id;// 아이디
	private String t_name;// 이름
	private String t_addr;// 주소
	private String t_company;// 회사
	private String t_phone;// 전화번호
	private String t_birth;// 생년월일
	private int t_gender; // 성별
	private String t_email;// 메일
	private String t_img;// 사진
	private int t_weight;// 몸무게
	private int t_height;// 키
	private String t_introduction;
	private Timestamp t_date;
	private int t_condition;
	private int t_out;
	private int um_num;
	private String u_id;
	private Timestamp um_date;

	public Mypage_management_Dto() {
	}

	public Mypage_management_Dto(String t_id, String t_name, String t_addr, String t_company, String t_phone,
			String t_birth, int t_gender, String t_email, String t_img, int t_weight, int t_height,
			String t_introduction, Timestamp t_date, int t_condition, int t_out, int um_num, String u_id,
			Timestamp um_date) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_addr = t_addr;
		this.t_company = t_company;
		this.t_phone = t_phone;
		this.t_birth = t_birth;
		this.t_gender = t_gender;
		this.t_email = t_email;
		this.t_img = t_img;
		this.t_weight = t_weight;
		this.t_height = t_height;
		this.t_introduction = t_introduction;
		this.t_date = t_date;
		this.t_condition = t_condition;
		this.t_out = t_out;
		this.um_num = um_num;
		this.u_id = u_id;
		this.um_date = um_date;
	}

	public String getT_id() {
		return t_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
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

	public int getT_gender() {
		return t_gender;
	}

	public void setT_gender(int t_gender) {
		this.t_gender = t_gender;
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

	public int getT_weight() {
		return t_weight;
	}

	public void setT_weight(int t_weight) {
		this.t_weight = t_weight;
	}

	public int getT_height() {
		return t_height;
	}

	public void setT_height(int t_height) {
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

	public int getT_out() {
		return t_out;
	}

	public void setT_out(int t_out) {
		this.t_out = t_out;
	}

	public int getUm_num() {
		return um_num;
	}

	public void setUm_num(int um_num) {
		this.um_num = um_num;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public Timestamp getUm_date() {
		return um_date;
	}

	public void setUm_date(Timestamp um_date) {
		this.um_date = um_date;
	}

}
