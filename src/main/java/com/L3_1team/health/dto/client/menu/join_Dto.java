package com.L3_1team.health.dto.client.menu;

import java.sql.Timestamp;

public class join_Dto {
	private int join_num;
	private String t_id;
	private String u_id;
	private Timestamp join_date;
	private String join_condition;

	public join_Dto() {
	}

	public join_Dto(int join_num, String t_id, String u_id, Timestamp join_date, String join_condition) {
		super();
		this.join_num = join_num;
		this.t_id = t_id;
		this.u_id = u_id;
		this.join_date = join_date;
		this.join_condition = join_condition;
	}

	public int getJoin_num() {
		return join_num;
	}

	public void setJoin_num(int join_num) {
		this.join_num = join_num;
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

	public Timestamp getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Timestamp join_date) {
		this.join_date = join_date;
	}

	public String getJoin_condition() {
		return join_condition;
	}

	public void setJoin_condition(String join_condition) {
		this.join_condition = join_condition;
	}

	@Override
	public String toString() {
		return "join_Dto [join_num=" + join_num + ", t_id=" + t_id + ", u_id=" + u_id + ", join_date=" + join_date
				+ ", join_condition=" + join_condition + "]";
	}
}
