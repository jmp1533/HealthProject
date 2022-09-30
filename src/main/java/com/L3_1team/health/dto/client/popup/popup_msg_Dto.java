package com.L3_1team.health.dto.client.popup;

import java.sql.Timestamp;

public class popup_msg_Dto {
	private int msg_num;
	private String msg_send_id;
	private String msg_receive_id;
	private String msg_title;
	private String msg_content;
	private Timestamp msg_date;
	private int msg_condition;

	public popup_msg_Dto() {
	}

	public popup_msg_Dto(int msg_num, String msg_send_id, String msg_receive_id, String msg_title, String msg_content,
			Timestamp msg_date, int msg_condition) {
		super();
		this.msg_num = msg_num;
		this.msg_send_id = msg_send_id;
		this.msg_receive_id = msg_receive_id;
		this.msg_title = msg_title;
		this.msg_content = msg_content;
		this.msg_date = msg_date;
		this.msg_condition = msg_condition;
	}

	public int getMsg_num() {
		return msg_num;
	}

	public void setMsg_num(int msg_num) {
		this.msg_num = msg_num;
	}

	public String getMsg_send_id() {
		return msg_send_id;
	}

	public void setMsg_send_id(String msg_send_id) {
		this.msg_send_id = msg_send_id;
	}

	public String getMsg_receive_id() {
		return msg_receive_id;
	}

	public void setMsg_receive_id(String msg_receive_id) {
		this.msg_receive_id = msg_receive_id;
	}

	public String getMsg_title() {
		return msg_title;
	}

	public void setMsg_title(String msg_title) {
		this.msg_title = msg_title;
	}

	public String getMsg_content() {
		return msg_content;
	}

	public void setMsg_content(String msg_content) {
		this.msg_content = msg_content;
	}

	public Timestamp getMsg_date() {
		return msg_date;
	}

	public void setMsg_date(Timestamp msg_date) {
		this.msg_date = msg_date;
	}

	public int getMsg_condition() {
		return msg_condition;
	}

	public void setMsg_condition(int msg_condition) {
		this.msg_condition = msg_condition;
	}

	@Override
	public String toString() {
		return "popup_msg_Dto [msg_num=" + msg_num + ", msg_send_id=" + msg_send_id + ", msg_receive_id="
				+ msg_receive_id + ", msg_title=" + msg_title + ", msg_content=" + msg_content + ", msg_date="
				+ msg_date + ", msg_condition=" + msg_condition + "]";
	}
}
