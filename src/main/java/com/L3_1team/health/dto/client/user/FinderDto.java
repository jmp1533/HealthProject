package com.L3_1team.health.dto.client.user;

public class FinderDto {
	private String id;
	private int question;
	private String answer;
	private String email;

	public FinderDto(String id, int question, String answer, String email) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.email = email;
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
