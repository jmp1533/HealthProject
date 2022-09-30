package com.L3_1team.health.dto.client.menu;

import java.sql.Timestamp;

public class People_user_reple_Dto {
	private int pr_num;
	private int p_num;
	private String id;
	private String pr_content;
	private Timestamp pr_date;

	public People_user_reple_Dto() {
	}

	public People_user_reple_Dto(int pr_num, int p_num, String id, String pr_content, Timestamp pr_date) {
		super();
		this.pr_num = pr_num;
		this.p_num = p_num;
		this.id = id;
		this.pr_content = pr_content;
		this.pr_date = pr_date;
	}

	public int getPr_num() {
		return pr_num;
	}

	public void setPr_num(int pr_num) {
		this.pr_num = pr_num;
	}

	public int getP_num() {
		return p_num;
	}

	public void setP_num(int p_num) {
		this.p_num = p_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPr_content() {
		return pr_content;
	}

	public void setPr_content(String pr_content) {
		this.pr_content = pr_content;
	}

	public Timestamp getPr_date() {
		return pr_date;
	}

	public void setPr_date(Timestamp pr_date) {
		this.pr_date = pr_date;
	}
}
