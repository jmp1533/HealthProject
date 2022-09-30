package com.L3_1team.health.dto.client.menu;

public class Health_news_Dto {
	private String title;
	private String content;
	private String link;
	private String date;
	private int total;

	public Health_news_Dto(String title, String content, String link, String date, int total) {
		this.title = title;
		this.content = content;
		this.link = link;
		this.date = date;
		this.total = total;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
