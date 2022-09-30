package com.L3_1team.health.dto.client.menu;

import java.sql.Timestamp;

public class Finder_company_Dto {
	private int b_num;
	private String t_id;
	private String b_corporatenum;
	private String b_name;
	private String b_addr;
	private String zipcode;
	private String b_phone;
	private String b_email;
	private String b_content;
	private float b_x;
	private float b_y;
	private int b_condition;
	private Timestamp b_date;

	public Finder_company_Dto() {
	}

	public Finder_company_Dto(int b_num, String t_id, String b_corporatenum, String b_name, String b_addr,
			String zipcode, String b_phone, String b_email, String b_content, float b_x, float b_y, int b_condition,
			Timestamp b_date) {
		super();
		this.b_num = b_num;
		this.t_id = t_id;
		this.b_corporatenum = b_corporatenum;
		this.b_name = b_name;
		this.b_addr = b_addr;
		this.zipcode = zipcode;
		this.b_phone = b_phone;
		this.b_email = b_email;
		this.b_content = b_content;
		this.b_x = b_x;
		this.b_y = b_y;
		this.b_condition = b_condition;
		this.b_date = b_date;
	}

	public int getB_num() {
		return b_num;
	}

	public void setB_num(int b_num) {
		this.b_num = b_num;
	}

	public String getT_id() {
		return t_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}

	public String getB_corporatenum() {
		return b_corporatenum;
	}

	public void setB_corporatenum(String b_corporatenum) {
		this.b_corporatenum = b_corporatenum;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getB_addr() {
		return b_addr;
	}

	public void setB_addr(String b_addr) {
		this.b_addr = b_addr;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getB_phone() {
		return b_phone;
	}

	public void setB_phone(String b_phone) {
		this.b_phone = b_phone;
	}

	public String getB_email() {
		return b_email;
	}

	public void setB_email(String b_email) {
		this.b_email = b_email;
	}

	public String getB_content() {
		return b_content;
	}

	public void setB_content(String b_content) {
		this.b_content = b_content;
	}

	public float getB_x() {
		return b_x;
	}

	public void setB_x(float b_x) {
		this.b_x = b_x;
	}

	public float getB_y() {
		return b_y;
	}

	public void setB_y(float b_y) {
		this.b_y = b_y;
	}

	public int getB_condition() {
		return b_condition;
	}

	public void setB_condition(int b_condition) {
		this.b_condition = b_condition;
	}

	public Timestamp getB_date() {
		return b_date;
	}

	public void setB_date(Timestamp b_date) {
		this.b_date = b_date;
	}

	@Override
	public String toString() {
		return "Finder_company_Dto [b_num=" + b_num + ", t_id=" + t_id + ", b_corporatenum=" + b_corporatenum
				+ ", b_name=" + b_name + ", b_addr=" + b_addr + ", zipcode=" + zipcode + ", b_phone=" + b_phone
				+ ", b_email=" + b_email + ", b_content=" + b_content + ", b_x=" + b_x + ", b_y=" + b_y
				+ ", b_condition=" + b_condition + ", b_date=" + b_date + "]";
	}
}
