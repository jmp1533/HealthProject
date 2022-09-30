package com.L3_1team.health.dto.admin;

public class Health_Dto {
	private int b_num;
	private String b_corporatenum1;
	private String b_corporatenum2;
	private String b_corporatenum3;
	private String b_name;
	private String addr1;
	private String addr2;
	private String zipcode1;
	private String b_phone1;
	private String b_phone2;
	private String b_phone3;
	private String b_email1;
	private String b_email2;
	private String b_content;
	private float b_x;
	private float b_y;

	public Health_Dto() {
	}

	public Health_Dto(int b_num, String b_corporatenum1, String b_corporatenum2, String b_corporatenum3, String b_name,
			String addr1, String addr2, String zipcode1, String b_phone1, String b_phone2, String b_phone3,
			String b_email1, String b_email2, String b_content, float b_x, float b_y) {
		super();
		this.b_num = b_num;
		this.b_corporatenum1 = b_corporatenum1;
		this.b_corporatenum2 = b_corporatenum2;
		this.b_corporatenum3 = b_corporatenum3;
		this.b_name = b_name;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.zipcode1 = zipcode1;
		this.b_phone1 = b_phone1;
		this.b_phone2 = b_phone2;
		this.b_phone3 = b_phone3;
		this.b_email1 = b_email1;
		this.b_email2 = b_email2;
		this.b_content = b_content;
		this.b_x = b_x;
		this.b_y = b_y;
	}

	public int getB_num() {
		return b_num;
	}

	public void setB_num(int b_num) {
		this.b_num = b_num;
	}

	public String getB_corporatenum1() {
		return b_corporatenum1;
	}

	public void setB_corporatenum1(String b_corporatenum1) {
		this.b_corporatenum1 = b_corporatenum1;
	}

	public String getB_corporatenum2() {
		return b_corporatenum2;
	}

	public void setB_corporatenum2(String b_corporatenum2) {
		this.b_corporatenum2 = b_corporatenum2;
	}

	public String getB_corporatenum3() {
		return b_corporatenum3;
	}

	public void setB_corporatenum3(String b_corporatenum3) {
		this.b_corporatenum3 = b_corporatenum3;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getZipcode1() {
		return zipcode1;
	}

	public void setZipcode1(String zipcode1) {
		this.zipcode1 = zipcode1;
	}

	public String getB_phone1() {
		return b_phone1;
	}

	public void setB_phone1(String b_phone1) {
		this.b_phone1 = b_phone1;
	}

	public String getB_phone2() {
		return b_phone2;
	}

	public void setB_phone2(String b_phone2) {
		this.b_phone2 = b_phone2;
	}

	public String getB_phone3() {
		return b_phone3;
	}

	public void setB_phone3(String b_phone3) {
		this.b_phone3 = b_phone3;
	}

	public String getB_email1() {
		return b_email1;
	}

	public void setB_email1(String b_email1) {
		this.b_email1 = b_email1;
	}

	public String getB_email2() {
		return b_email2;
	}

	public void setB_email2(String b_email2) {
		this.b_email2 = b_email2;
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

	@Override
	public String toString() {
		return "Health_Dto [b_num=" + b_num + ", b_corporatenum1=" + b_corporatenum1 + ", b_corporatenum2="
				+ b_corporatenum2 + ", b_corporatenum3=" + b_corporatenum3 + ", b_name=" + b_name + ", addr1=" + addr1
				+ ", addr2=" + addr2 + ", zipcode1=" + zipcode1 + ", b_phone1=" + b_phone1 + ", b_phone2=" + b_phone2
				+ ", b_phone3=" + b_phone3 + ", b_email1=" + b_email1 + ", b_email2=" + b_email2 + ", b_content="
				+ b_content + ", b_x=" + b_x + ", b_y=" + b_y + "]";
	}
}
