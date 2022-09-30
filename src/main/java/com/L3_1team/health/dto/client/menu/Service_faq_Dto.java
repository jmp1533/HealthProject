package com.L3_1team.health.dto.client.menu;

import java.sql.Timestamp;
import java.util.Date;

public class Service_faq_Dto {
	private int faq_num;
	private String faq_cate;
	private String faq_question;
	private String faq_answer;
	private Timestamp faq_date;

	public Service_faq_Dto() {
	}

	public Service_faq_Dto(int faq_num, String faq_cate, String faq_question, String faq_answer, Timestamp faq_date) {
		super();
		this.faq_num = faq_num;
		this.faq_cate = faq_cate;
		this.faq_question = faq_question;
		this.faq_answer = faq_answer;
		this.faq_date = faq_date;
	}

	public int getFaq_num() {
		return faq_num;
	}

	public void setFaq_num(int faq_num) {
		this.faq_num = faq_num;
	}

	public String getFaq_cate() {
		return faq_cate;
	}

	public void setFaq_cate(String faq_cate) {
		this.faq_cate = faq_cate;
	}

	public String getFaq_question() {
		return faq_question;
	}

	public void setFaq_question(String faq_question) {
		this.faq_question = faq_question;
	}

	public String getFaq_answer() {
		return faq_answer;
	}

	public void setFaq_answer(String faq_answer) {
		this.faq_answer = faq_answer;
	}

	public Timestamp getFaq_date() {
		return faq_date;
	}

	public void setFaq_date(Timestamp faq_date) {
		this.faq_date = faq_date;
	}

	@Override
	public String toString() {
		return "Service_faq_Dto [faq_num=" + faq_num + ", faq_cate=" + faq_cate + ", faq_question=" + faq_question
				+ ", faq_answer=" + faq_answer + ", faq_date=" + faq_date + "]";
	}

}