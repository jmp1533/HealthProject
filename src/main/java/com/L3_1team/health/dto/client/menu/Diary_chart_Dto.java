package com.L3_1team.health.dto.client.menu;

import java.sql.Date;

public class Diary_chart_Dto {

	private int ui_num;
	private String u_id;
	private int ui_weight;
	private int ui_height;
	private Date ui_date;

	public Diary_chart_Dto() {
	};

	public Diary_chart_Dto(int ui_num, String u_id, int ui_weight, int ui_height, Date ui_date) {
		super();
		this.ui_num = ui_num;
		this.u_id = u_id;
		this.ui_weight = ui_weight;
		this.ui_height = ui_height;
		this.ui_date = ui_date;
	}

	public int getUi_num() {
		return ui_num;
	}

	public void setUi_num(int ui_num) {
		this.ui_num = ui_num;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public int getUi_weight() {
		return ui_weight;
	}

	public void setUi_weight(int ui_weight) {
		this.ui_weight = ui_weight;
	}

	public int getUi_height() {
		return ui_height;
	}

	public void setUi_height(int ui_height) {
		this.ui_height = ui_height;
	}

	public Date getUi_date() {
		return ui_date;
	}

	public void setUi_date(Date ui_date) {
		this.ui_date = ui_date;
	}

}
