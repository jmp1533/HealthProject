package com.L3_1team.health.dto.admin;

import java.sql.Timestamp;

public class admin_userslog_Dto {
	private int ul_num;
	private String u_id;
	private Timestamp ul_date;

	public admin_userslog_Dto() {
	}

	public admin_userslog_Dto(int ul_num, String u_id, Timestamp ul_date) {
		super();
		this.ul_num = ul_num;
		this.u_id = u_id;
		this.ul_date = ul_date;
	}

	public int getUl_num() {
		return ul_num;
	}

	public void setUl_num(int ul_num) {
		this.ul_num = ul_num;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public Timestamp getUl_date() {
		return ul_date;
	}

	public void setUl_date(Timestamp ul_date) {
		this.ul_date = ul_date;
	}

}
