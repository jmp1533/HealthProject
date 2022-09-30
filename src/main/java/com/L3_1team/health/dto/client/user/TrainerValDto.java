package com.L3_1team.health.dto.client.user;

public class TrainerValDto {
	private String id1;
	private String pwd1;
	private String pwd2;
	private int question1;
	private String answer1;
	private String name1;
	private String birth1;
	private int gender1;
	private String company1;
	private String zipcode1;
	private String addr1;
	private String addr2;
	private String phone1;
	private String phone2;
	private String phone3;
	private String email1;
	private String email2;
	private float height1;
	private float weight1;
	private String introduction1;
	private String img1;

	public TrainerValDto() {
	}

	public TrainerValDto(String id1, String pwd1, String pwd2, int question1, String answer1, String name1,
			String birth1, int gender1, String company1, String zipcode1, String addr1, String addr2, String phone1,
			String phone2, String phone3, String email1, String email2, float height1, float weight1,
			String introduction1, String img1) {
		super();
		this.id1 = id1;
		this.pwd1 = pwd1;
		this.pwd2 = pwd2;
		this.question1 = question1;
		this.answer1 = answer1;
		this.name1 = name1;
		this.birth1 = birth1;
		this.gender1 = gender1;
		this.company1 = company1;
		this.zipcode1 = zipcode1;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.email1 = email1;
		this.email2 = email2;
		this.height1 = height1;
		this.weight1 = weight1;
		this.introduction1 = introduction1;
		this.img1 = img1;
	}

	public String getId1() {
		return id1;
	}

	public void setId1(String id1) {
		this.id1 = id1;
	}

	public String getPwd1() {
		return pwd1;
	}

	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}

	public String getPwd2() {
		return pwd2;
	}

	public void setPwd2(String pwd2) {
		this.pwd2 = pwd2;
	}

	public int getQuestion1() {
		return question1;
	}

	public void setQuestion1(int question1) {
		this.question1 = question1;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getBirth1() {
		return birth1;
	}

	public void setBirth1(String birth1) {
		this.birth1 = birth1;
	}

	public int getGender1() {
		return gender1;
	}

	public void setGender1(int gender1) {
		this.gender1 = gender1;
	}

	public String getCompany1() {
		return company1;
	}

	public void setCompany1(String company1) {
		this.company1 = company1;
	}

	public String getZipcode1() {
		return zipcode1;
	}

	public void setZipcode1(String zipcode1) {
		this.zipcode1 = zipcode1;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public float getHeight1() {
		return height1;
	}

	public void setHeight1(float height1) {
		this.height1 = height1;
	}

	public float getWeight1() {
		return weight1;
	}

	public void setWeight1(float weight1) {
		this.weight1 = weight1;
	}

	public String getIntroduction1() {
		return introduction1;
	}

	public void setIntroduction1(String introduction1) {
		this.introduction1 = introduction1;
	}

	public String getImg1() {
		return img1;
	}

	public void setImg1(String img1) {
		this.img1 = img1;
	}

	@Override
	public String toString() {
		return "TrainerValDto [id1=" + id1 + ", pwd1=" + pwd1 + ", pwd2=" + pwd2 + ", question1=" + question1
				+ ", answer1=" + answer1 + ", name1=" + name1 + ", birth1=" + birth1 + ", gender1=" + gender1
				+ ", company1=" + company1 + ", zipcode1=" + zipcode1 + ", addr1=" + addr1 + ", addr2=" + addr2
				+ ", phone1=" + phone1 + ", phone2=" + phone2 + ", phone3=" + phone3 + ", email1=" + email1
				+ ", email2=" + email2 + ", height1=" + height1 + ", weight1=" + weight1 + ", introduction1="
				+ introduction1 + ", img1=" + img1 + "]";
	}
}
