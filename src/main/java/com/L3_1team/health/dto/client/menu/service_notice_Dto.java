package com.L3_1team.health.dto.client.menu;

import java.sql.Timestamp;

import javax.xml.crypto.Data;

public class service_notice_Dto {
	private int noti_num;
	private String admin_id;
	private String noti_title;
	private String noti_content;
	private int noti_hits;
	private Timestamp noti_date;

	public service_notice_Dto() {
	}

	public service_notice_Dto(int noti_num, String admin_id, String noti_title, String noti_content, int noti_hits,
			Timestamp noti_date) {
		super();
		this.noti_num = noti_num;
		this.admin_id = admin_id;
		this.noti_title = noti_title;
		this.noti_content = noti_content;
		this.noti_hits = noti_hits;
		this.noti_date = noti_date;
	}

	public int getNoti_num() {
		return noti_num;
	}

	public void setNoti_num(int noti_num) {
		this.noti_num = noti_num;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public String getNoti_title() {
		return noti_title;
	}

	public void setNoti_title(String noti_title) {
		this.noti_title = noti_title;
	}

	public String getNoti_content() {
		return noti_content;
	}

	public void setNoti_content(String noti_content) {
		this.noti_content = noti_content;
	}

	public int getNoti_hits() {
		return noti_hits;
	}

	public void setNoti_hits(int noti_hits) {
		this.noti_hits = noti_hits;
	}

	public Timestamp getNoti_date() {
		return noti_date;
	}

	public void setNoti_date(Timestamp noti_date) {
		this.noti_date = noti_date;
	}

	@Override
	public String toString() {
		return "service_notice_Dto [noti_num=" + noti_num + ", admin_id=" + admin_id + ", noti_title=" + noti_title
				+ ", noti_content=" + noti_content + ", noti_hits=" + noti_hits + ", noti_date=" + noti_date + "]";
	}
}
