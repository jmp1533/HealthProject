package com.L3_1team.health.dto.client.popup;

public class food_popup_Dto {

	private int num;
	private String name;
	private int kcal;
	private int tan;
	private int dan;
	private int ji;
	private int col;

	public food_popup_Dto() {
	}

	public food_popup_Dto(int num, String name, int kcal, int tan, int dan, int ji, int col) {
		super();
		this.num = num;
		this.name = name;
		this.kcal = kcal;
		this.tan = tan;
		this.dan = dan;
		this.ji = ji;
		this.col = col;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public int getTan() {
		return tan;
	}

	public void setTan(int tan) {
		this.tan = tan;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public int getJi() {
		return ji;
	}

	public void setJi(int ji) {
		this.ji = ji;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

}
