package com.L3_1team.health.dto.admin;

import java.sql.Timestamp;

public class admin_trainerslog_Dto {
	private int tl_num;
	private String t_id;
	private Timestamp tl_date;

	public admin_trainerslog_Dto() {
	}

	public admin_trainerslog_Dto(int tl_num, String t_id, Timestamp tl_date) {
		super();
		this.tl_num = tl_num;
		this.t_id = t_id;
		this.tl_date = tl_date;
	}

	public int getTl_num() {
		return tl_num;
	}

	public void setTl_num(int tl_num) {
		this.tl_num = tl_num;
	}

	public String getT_id() {
		return t_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}

	public Timestamp getTl_date() {
		return tl_date;
	}

	public void setTl_date(Timestamp tl_date) {
		this.tl_date = tl_date;
	}

	@Override
	public String toString() {
		return "admin_trainerslog_Dto [tl_num=" + tl_num + ", t_id=" + t_id + ", tl_date=" + tl_date + "]";
	}

}
