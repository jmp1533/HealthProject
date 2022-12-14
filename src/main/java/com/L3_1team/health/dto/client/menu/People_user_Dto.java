package com.L3_1team.health.dto.client.menu;

public class People_user_Dto {
	private int p_num;
	private String id;
	private String p_img;
	private String p_sportsdate;// 운동날짜
	private String p_sportstime;// 운동시간
	private String p_title;
	private String p_content;
	private String p_zone;// 지역
	private int p_hits;// 조회수

	public People_user_Dto() {
	}

	public People_user_Dto(int p_num, String id, String p_img, String p_sportsdate, String p_sportstime, String p_title,
			String p_content, String p_zone, int p_hits) {
		super();
		this.p_num = p_num;
		this.id = id;
		this.p_img = p_img;
		this.p_sportsdate = p_sportsdate;
		this.p_sportstime = p_sportstime;
		this.p_title = p_title;
		this.p_content = p_content;
		this.p_zone = p_zone;
		this.p_hits = p_hits;
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

	public String getP_img() {
		return p_img;
	}

	public void setP_img(String p_img) {
		this.p_img = p_img;
	}

	public String getP_sportsdate() {
		return p_sportsdate;
	}

	public void setP_sportsdate(String p_sportsdate) {
		this.p_sportsdate = p_sportsdate;
	}

	public String getP_sportstime() {
		return p_sportstime;
	}

	public void setP_sportstime(String p_sportstime) {
		this.p_sportstime = p_sportstime;
	}

	public String getP_title() {
		return p_title;
	}

	public void setP_title(String p_title) {
		this.p_title = p_title;
	}

	public String getP_content() {
		return p_content;
	}

	public void setP_content(String p_content) {
		this.p_content = p_content;
	}

	public String getP_zone() {
		return p_zone;
	}

	public void setP_zone(String p_zone) {
		this.p_zone = p_zone;
	}

	public int getP_hits() {
		return p_hits;
	}

	public void setP_hits(int p_hits) {
		this.p_hits = p_hits;
	}

}
