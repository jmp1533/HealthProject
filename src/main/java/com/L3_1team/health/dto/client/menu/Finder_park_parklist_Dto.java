package com.L3_1team.health.dto.client.menu;

public class Finder_park_parklist_Dto {
	private int p_idx; // 인덱스
	private String p_park; // 공원명
	private String p_list_content; // 공원설명
	private String p_addr; // 주소
	private String p_zone;
	private String p_division;
	private String p_img; // 이미지
	private String p_admintel; // 전화번호
	private float logitude;
	private float latitude;

	public Finder_park_parklist_Dto() {
	}

	public Finder_park_parklist_Dto(int p_idx, String p_park, String p_list_content, String p_addr, String p_zone,
			String p_division, String p_img, String p_admintel, float logitude, float latitude) {
		super();
		this.p_idx = p_idx;
		this.p_park = p_park;
		this.p_list_content = p_list_content;
		this.p_addr = p_addr;
		this.p_zone = p_zone;
		this.p_division = p_division;
		this.p_img = p_img;
		this.p_admintel = p_admintel;
		this.logitude = logitude;
		this.latitude = latitude;
	}

	public int getP_idx() {
		return p_idx;
	}

	public void setP_idx(int p_idx) {
		this.p_idx = p_idx;
	}

	public String getP_park() {
		return p_park;
	}

	public void setP_park(String p_park) {
		this.p_park = p_park;
	}

	public String getP_list_content() {
		return p_list_content;
	}

	public void setP_list_content(String p_list_content) {
		this.p_list_content = p_list_content;
	}

	public String getP_addr() {
		return p_addr;
	}

	public void setP_addr(String p_addr) {
		this.p_addr = p_addr;
	}

	public String getP_zone() {
		return p_zone;
	}

	public void setP_zone(String p_zone) {
		this.p_zone = p_zone;
	}

	public String getP_division() {
		return p_division;
	}

	public void setP_division(String p_division) {
		this.p_division = p_division;
	}

	public String getP_img() {
		return p_img;
	}

	public void setP_img(String p_img) {
		this.p_img = p_img;
	}

	public String getP_admintel() {
		return p_admintel;
	}

	public void setP_admintel(String p_admintel) {
		this.p_admintel = p_admintel;
	}

	public float getLogitude() {
		return logitude;
	}

	public void setLogitude(float logitude) {
		this.logitude = logitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "Finder_park_parklist_Dto [p_idx=" + p_idx + ", p_park=" + p_park + ", p_list_content=" + p_list_content
				+ ", p_addr=" + p_addr + ", p_zone=" + p_zone + ", p_division=" + p_division + ", p_img=" + p_img
				+ ", p_admintel=" + p_admintel + ", logitude=" + logitude + ", latitude=" + latitude + "]";
	}
}
