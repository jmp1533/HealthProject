package com.L3_1team.health.dto.client.user;

public class AccountFinderDto {
	private String id;
	private int question;
	private String answer;
	private String email;
	private String search_1; // searchmain.jsp���� 泥ル�吏� 媛��� �살�댁���� ���ν���ㅻ�� 媛�
	private String search_2; // searchmain.jsp���� ��踰�吏� 媛��� �살�댁���� ���ν���ㅻ�� 媛�

	public AccountFinderDto(String search_1, String search_2) {
		this.search_1 = search_1;
		this.search_2 = search_2;
	}

	public AccountFinderDto(int question, String answer) {
		super();
		this.question = question;
		this.answer = answer;
	}

	public String getSearch_1() {
		return search_1;
	}

	public void setSearch_1(String search_1) {
		this.search_1 = search_1;
	}

	public String getSearch_2() {
		return search_2;
	}

	public void setSearch_2(String search_2) {
		this.search_2 = search_2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQuestion() {
		return question;
	}

	public void setQuestion(int question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
