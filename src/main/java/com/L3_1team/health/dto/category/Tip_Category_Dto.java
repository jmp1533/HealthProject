package com.L3_1team.health.dto.category;

public class Tip_Category_Dto {
	private int tcate_num;
	private String tcate_name;

	public Tip_Category_Dto() {
	}

	public Tip_Category_Dto(int tcate_num, String tcate_name) {
		this.tcate_num = tcate_num;
		this.tcate_name = tcate_name;
	}

	public int getTcate_num() {
		return tcate_num;
	}

	public void setTcate_num(int tcate_num) {
		this.tcate_num = tcate_num;
	}

	public String getTcate_name() {
		return tcate_name;
	}

	public void setTcate_name(String tcate_name) {
		this.tcate_name = tcate_name;
	}
}
