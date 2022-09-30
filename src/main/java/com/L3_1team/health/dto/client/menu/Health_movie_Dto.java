package com.L3_1team.health.dto.client.menu;

public class Health_movie_Dto {
	private int v_num;
	private String admin_id;
	private String vcate_num;
	private String v_title;
	private String v_link;
	private String v_image;
	private String v_content;
	private int v_hits;

	public Health_movie_Dto() {
	}

	public Health_movie_Dto(int v_num, String admin_id, String vcate_num, String v_title, String v_link, String v_image,
			String v_content, int v_hits) {
		this.v_num = v_num;
		this.admin_id = admin_id;
		this.vcate_num = vcate_num;
		this.v_title = v_title;
		this.v_link = v_link;
		this.v_image = v_image;
		this.v_content = v_content;
		this.v_hits = v_hits;
	}

	public int getV_num() {
		return v_num;
	}

	public void setV_num(int v_num) {
		this.v_num = v_num;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public String getVcate_num() {
		return vcate_num;
	}

	public void setVcate_num(String vcate_num) {
		this.vcate_num = vcate_num;
	}

	public String getV_title() {
		return v_title;
	}

	public void setV_title(String v_title) {
		this.v_title = v_title;
	}

	public String getV_link() {
		return v_link;
	}

	public void setV_link(String v_link) {
		this.v_link = v_link;
	}

	public String getV_image() {
		return v_image;
	}

	public void setV_image(String v_image) {
		this.v_image = v_image;
	}

	public String getV_content() {
		return v_content;
	}

	public void setV_content(String v_content) {
		this.v_content = v_content;
	}

	public int getV_hits() {
		return v_hits;
	}

	public void setV_hits(int v_hits) {
		this.v_hits = v_hits;
	}

	@Override
	public String toString() {
		return "Health_movie_Dto [v_num=" + v_num + ", admin_id=" + admin_id + ", vcate_num=" + vcate_num + ", v_title="
				+ v_title + ", v_link=" + v_link + ", v_image=" + v_image + ", v_content=" + v_content + ", v_hits="
				+ v_hits + "]";
	}

}
