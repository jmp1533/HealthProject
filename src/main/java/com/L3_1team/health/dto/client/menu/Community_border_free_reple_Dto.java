package com.L3_1team.health.dto.client.menu;

import java.sql.Timestamp;

public class Community_border_free_reple_Dto {
	private int fr_num;
	private int free_num;
	private String id;
	private String fr_content;
	private Timestamp fr_date;

	public Community_border_free_reple_Dto() {
	};

	public Community_border_free_reple_Dto(int fr_num, int free_num, String id, String fr_content, Timestamp fr_date) {
		super();
		this.fr_num = fr_num;
		this.free_num = free_num;
		this.id = id;
		this.fr_content = fr_content;
		this.fr_date = fr_date;
	}

	public int getFr_num() {
		return fr_num;
	}

	public void setFr_num(int fr_num) {
		this.fr_num = fr_num;
	}

	public int getFree_num() {
		return free_num;
	}

	public void setFree_num(int free_num) {
		this.free_num = free_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFr_content() {
		return fr_content;
	}

	public void setFr_content(String fr_content) {
		this.fr_content = fr_content;
	}

	public Timestamp getFr_date() {
		return fr_date;
	}

	public void setFr_date(Timestamp fr_date) {
		this.fr_date = fr_date;
	}

}
