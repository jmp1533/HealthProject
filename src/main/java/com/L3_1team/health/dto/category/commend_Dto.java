package com.L3_1team.health.dto.category;

public class commend_Dto {
	private int trc_num;
	private int tip_num;
	private String id;

	public commend_Dto() {
	}

	public commend_Dto(int trc_num, int tip_num, String id) {
		this.trc_num = trc_num;
		this.tip_num = tip_num;
		this.id = id;
	}

	public int getTrc_num() {
		return trc_num;
	}

	public void setTrc_num(int trc_num) {
		this.trc_num = trc_num;
	}

	public int getTip_num() {
		return tip_num;
	}

	public void setTip_num(int tip_num) {
		this.tip_num = tip_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
