package com.L3_1team.health.dto.client.menu;

import java.sql.Date;

public class Diary_diary_Dto {
	private int d_num;
	private String id;
	private String d_title;
	private String d_content;
	private Date d_date;
	private String d;

	public Diary_diary_Dto() {
	}

	public Diary_diary_Dto(int d_num, String id, String d_title, String d_content, Date d_date) {
		super();
		this.d_num = d_num;
		this.id = id;
		this.d_title = d_title;
		this.d_content = d_content;
		this.d_date = d_date;
	}

	public int getD_num() {
		return d_num;
	}

	public void setD_num(int d_num) {
		this.d_num = d_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getD_title() {
		return d_title;
	}

	public void setD_title(String d_title) {
		this.d_title = d_title;
	}

	public String getD_content() {
		return d_content;
	}

	public void setD_content(String d_content) {
		this.d_content = d_content;
	}

	public Date getD_date() {
		return d_date;
	}

	public void setD_date(Date d_date) {
		this.d_date = d_date;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

}
