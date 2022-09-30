package com.L3_1team.health.dto.client.menu;

import java.sql.Timestamp;

public class userinfo_Dto {
	private int ui_num;
	private String u_id;
	private float ui_weight;
	private float ui_height;
	private Timestamp ui_date;

	public userinfo_Dto() {
	}

	public userinfo_Dto(int ui_num, String u_id, float ui_weight, float ui_height, Timestamp ui_date) {
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

	public float getUi_weight() {
		return ui_weight;
	}

	public void setUi_weight(float ui_weight) {
		this.ui_weight = ui_weight;
	}

	public float getUi_height() {
		return ui_height;
	}

	public void setUi_height(float ui_height) {
		this.ui_height = ui_height;
	}

	public Timestamp getUi_date() {
		return ui_date;
	}

	public void setUi_date(Timestamp ui_date) {
		this.ui_date = ui_date;
	}

	@Override
	public String toString() {
		return "userinfo_Dto [ui_num=" + ui_num + ", u_id=" + u_id + ", ui_weight=" + ui_weight + ", ui_height="
				+ ui_height + ", ui_date=" + ui_date + "]";
	}
}
