package com.L3_1team.health.dto.client.menu;

import java.sql.Timestamp;

public class Review_reple_Dto {
	private int rre_num;
	private int r_num;
	private String id;
	private String rre_content;
	private Timestamp rre_date;

	public Review_reple_Dto() {
	}

	public Review_reple_Dto(int rre_num, int r_num, String id, String rre_content, Timestamp rre_date) {
		this.rre_num = rre_num;
		this.r_num = r_num;
		this.id = id;
		this.rre_content = rre_content;
		this.rre_date = rre_date;
	}

	public int getRre_num() {
		return rre_num;
	}

	public void setRre_num(int rre_num) {
		this.rre_num = rre_num;
	}

	public int getR_num() {
		return r_num;
	}

	public void setR_num(int r_num) {
		this.r_num = r_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRre_content() {
		return rre_content;
	}

	public void setRre_content(String rre_content) {
		this.rre_content = rre_content;
	}

	public Timestamp getRre_date() {
		return rre_date;
	}

	public void setRre_date(Timestamp rre_date) {
		this.rre_date = rre_date;
	}
}