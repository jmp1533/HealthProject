package com.L3_1team.health.dto.client.menu;

import java.sql.Timestamp;

public class Community_border_tip_Dto {
	private int tip_num;
	private int tcate_num;
	private String id;
	private String tip_title;
	private String tip_content;
	private Timestamp tip_date;
	private int tip_hits;
	private int count;
	private String tcate_name;

	public Community_border_tip_Dto() {
	}

	public Community_border_tip_Dto(int tip_num, int tcate_num, String id, String tip_title, String tip_content,
			Timestamp tip_date, int tip_hits) {
		super();
		this.tip_num = tip_num;
		this.tcate_num = tcate_num;
		this.id = id;
		this.tip_title = tip_title;
		this.tip_content = tip_content;
		this.tip_date = tip_date;
		this.tip_hits = tip_hits;
	}

	public int getTip_num() {
		return tip_num;
	}

	public void setTip_num(int tip_num) {
		this.tip_num = tip_num;
	}

	public int getTcate_num() {
		return tcate_num;
	}

	public void setTcate_num(int tcate_num) {
		this.tcate_num = tcate_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTip_title() {
		return tip_title;
	}

	public void setTip_title(String tip_title) {
		this.tip_title = tip_title;
	}

	public String getTip_content() {
		return tip_content;
	}

	public void setTip_content(String tip_content) {
		this.tip_content = tip_content;
	}

	public Timestamp getTip_date() {
		return tip_date;
	}

	public void setTip_date(Timestamp tip_date) {
		this.tip_date = tip_date;
	}

	public int getTip_hits() {
		return tip_hits;
	}

	public void setTip_hits(int tip_hits) {
		this.tip_hits = tip_hits;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getTcate_name() {
		return tcate_name;
	}

	public void setTcate_name(String tcate_name) {
		this.tcate_name = tcate_name;
	}

}
