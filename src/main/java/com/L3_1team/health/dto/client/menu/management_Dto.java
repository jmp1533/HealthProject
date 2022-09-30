package com.L3_1team.health.dto.client.menu;

import java.sql.Timestamp;

public class management_Dto {
	private int um_num;
	private String t_id;
	private String u_id;
	private Timestamp um_date;

	public management_Dto() {
	}

	public management_Dto(int um_num, String t_id, String u_id, Timestamp um_date) {
		super();
		this.um_num = um_num;
		this.t_id = t_id;
		this.u_id = u_id;
		this.um_date = um_date;
	}

	public int getUm_num() {
		return um_num;
	}

	public void setUm_num(int um_num) {
		this.um_num = um_num;
	}

	public String getT_id() {
		return t_id;
	}

	public void setT_id(String t_id) {
		this.t_id = t_id;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public Timestamp getUm_date() {
		return um_date;
	}

	public void setUm_date(Timestamp um_date) {
		this.um_date = um_date;
	}

	@Override
	public String toString() {
		return "join_Dto [um_num=" + um_num + ", t_id=" + t_id + ", u_id=" + u_id + ", um_date=" + um_date + "]";
	}
}
