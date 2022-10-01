drop table users cascade constraints;
drop table trainers cascade constraints;
drop table management cascade constraints;
drop table trainerslog cascade constraints;
drop table recommendmenu cascade constraints;
drop table join cascade constraints;
drop table userinfo cascade constraints;
drop table userlog cascade constraints;
drop table people cascade constraints;
drop table peoplereple cascade constraints;
drop table diary cascade constraints;
drop table diaryreple cascade constraints;
drop table diarymenu cascade constraints;
drop table review cascade constraints;
drop table reviewrecommend cascade constraints;
drop table reviewreple cascade constraints;
drop table tipcategory cascade constraints;
drop table tiptitle cascade constraints;
drop table tipreple cascade constraints;
drop table tiprecommend cascade constraints;
drop table freetitle cascade constraints;
drop table freereple cascade constraints;
drop table freerecommend cascade constraints;
drop table questioncategory cascade constraints;
drop table questionboard cascade constraints;
drop table questionreple cascade constraints;
drop table admins cascade constraints;
drop table adminlog cascade constraints;
drop table videocategory cascade constraints;
drop table video cascade constraints;
drop table notification cascade constraints;
drop table business cascade constraints;
drop table businessimg cascade constraints;
drop table temporaryimg cascade constraints;
drop table faq cascade constraints;
drop table msg cascade constraints;
drop table out cascade constraints;

DROP SEQUENCE management_SEQ;
DROP SEQUENCE trainerslog_SEQ;
DROP SEQUENCE recommendmenu_SEQ;
DROP SEQUENCE join_SEQ;
DROP SEQUENCE userinfo_SEQ;
DROP SEQUENCE userlog_SEQ;
DROP SEQUENCE people_SEQ;
DROP SEQUENCE peoplereple_SEQ;
DROP SEQUENCE diary_SEQ;
DROP SEQUENCE diaryreple_SEQ;
DROP SEQUENCE diarymenu_SEQ;
DROP SEQUENCE review_SEQ;
DROP SEQUENCE reviewrecommend_SEQ;
DROP SEQUENCE reviewreple_SEQ;
DROP SEQUENCE tipcategory_SEQ;
DROP SEQUENCE tiptitle_SEQ;
DROP SEQUENCE tipreple_SEQ;
DROP SEQUENCE tiprecommend_SEQ;
DROP SEQUENCE freetitle_SEQ;
DROP SEQUENCE freereple_SEQ;
DROP SEQUENCE freerecommend_SEQ;
DROP SEQUENCE questioncategory_SEQ;
DROP SEQUENCE questionboard_SEQ;
DROP SEQUENCE questionreple_SEQ;
DROP SEQUENCE adminlog_SEQ;
DROP SEQUENCE videocategory_SEQ;
DROP SEQUENCE video_SEQ;
DROP SEQUENCE notification_SEQ;
DROP SEQUENCE business_SEQ;
DROP SEQUENCE businessimg_SEQ;
DROP SEQUENCE temporaryimg_SEQ;
DROP SEQUENCE faq_SEQ;
DROP SEQUENCE msg_SEQ;
DROP SEQUENCE out_SEQ;

CREATE SEQUENCE management_SEQ;
CREATE SEQUENCE trainerslog_SEQ;
CREATE SEQUENCE recommendmenu_SEQ;
CREATE SEQUENCE join_SEQ;
CREATE SEQUENCE userinfo_SEQ;
CREATE SEQUENCE userlog_SEQ;
CREATE SEQUENCE people_SEQ;
CREATE SEQUENCE peoplereple_SEQ;
CREATE SEQUENCE diary_SEQ;
CREATE SEQUENCE diaryreple_SEQ;
CREATE SEQUENCE diarymenu_SEQ;
CREATE SEQUENCE review_SEQ;
CREATE SEQUENCE reviewrecommend_SEQ;
CREATE SEQUENCE reviewreple_SEQ;
CREATE SEQUENCE tipcategory_SEQ;
CREATE SEQUENCE tiptitle_SEQ;
CREATE SEQUENCE tipreple_SEQ;
CREATE SEQUENCE tiprecommend_SEQ;
CREATE SEQUENCE freetitle_SEQ;
CREATE SEQUENCE freereple_SEQ;
CREATE SEQUENCE freerecommend_SEQ;
CREATE SEQUENCE questioncategory_SEQ;
CREATE SEQUENCE questionboard_SEQ;
CREATE SEQUENCE questionreple_SEQ;
CREATE SEQUENCE adminlog_SEQ;
CREATE SEQUENCE videocategory_SEQ;
CREATE SEQUENCE video_SEQ;
CREATE SEQUENCE notification_SEQ;
CREATE SEQUENCE business_SEQ;
CREATE SEQUENCE businessimg_SEQ;
CREATE SEQUENCE temporaryimg_SEQ;
CREATE SEQUENCE faq_SEQ;
CREATE SEQUENCE msg_SEQ;
CREATE SEQUENCE out_SEQ;

--*********************************/
-- Table Name: ��(user) */
--*********************************/
CREATE TABLE users(
		u_id VARCHAR2(30)  PRIMARY KEY,--���̵�
		u_pwd VARCHAR2(30),--��й�ȣ
		u_question number,--��й�ȣ����
		u_answer VARCHAR2(60),--��й�ȣ�亯
		u_name VARCHAR2(30), --�̸�
		u_img VARCHAR2(200),--ȸ���̹���
		u_phone VARCHAR2(20),--��ȭ��ȣ
		u_email VARCHAR2(45),--�̸���
		u_zipcode VARCHAR2(10),--�����ȣ
		u_addr VARCHAR2(100),--�ּ�
		u_birth VARCHAR2(20),--�������
		u_gender number,--����(1����,2����)
		u_targetweight number,--��ǥü��
		u_regdate DATE,--������
		u_out number--Ż�𿩺�(1����,0Ż��)
);

--*********************************/
-- Table Name: Ʈ���̳� */
--*********************************/
CREATE TABLE trainers(
		t_id VARCHAR2(30)  PRIMARY KEY,	--���̵�
		t_pwd VARCHAR2(30),--��й�ȣ
		t_name VARCHAR2(30), --�̸�
		zipcode VARCHAR2(7),--�����ȣ
		t_addr VARCHAR2(100),--�ּ�
		t_company VARCHAR2(50),--ȸ��
		t_phone VARCHAR2(20),--��ȭ��ȣ
		t_birth VARCHAR2(20),--�������
		t_email VARCHAR2(45),--�̸���
		t_img VARCHAR2(200),--Ʈ���̳��̹���
		t_question number,--��й�ȣ����
		t_answer VARCHAR2(60),--��й�ȣ�亯
		t_gender number,--����(1����,2����)
		t_height number,--Ʈ���̳�Ű
		t_weight number,--Ʈ���̳ʸ�����
		t_introduction VARCHAR2(300),--�Ұ���
		t_date date,--���Խ�û��¥ 
		t_condition number,--���Ի���
		t_out number--Ż�𿩺�(1����,2Ż��)
);

--*********************************/
-- Table Name: Ʈ���̳ʰ������� */
--*********************************/
CREATE TABLE management(
		um_num number  PRIMARY KEY,--������ȣ(management_SEQ.NEXTVAL)
		t_id VARCHAR2(30) REFERENCES trainers(t_id),--Ʈ���̳ʾ��̵�
		u_id VARCHAR2(30) REFERENCES users(u_id),--ȸ�����̵�
		um_date DATE--��¥
);

--*********************************/
-- Table Name: �αױ��(Ʈ���̳�) */
--*********************************/
CREATE TABLE trainerslog(
		tl_num number  PRIMARY KEY,
		t_id VARCHAR2(30) REFERENCES trainers(t_id),
		tl_date TIMESTAMP
);

--*********************************/
-- Table Name: ��õ�Ĵ� */
--*********************************/
CREATE TABLE recommendmenu(
		rm_num number  PRIMARY KEY,
		um_num number REFERENCES management(um_num),--������ȣ
		rm_menu number,--Ʈ���̳ʱ���Į�θ�
		rm_date DATE
);

--*********************************/
-- Table Name: ���λ��� */
--*********************************/
CREATE TABLE join(
		join_num number  PRIMARY KEY,
		t_id VARCHAR2(30) REFERENCES trainers(t_id),
		u_id VARCHAR2(30) REFERENCES users(u_id),
		join_date TIMESTAMP,
		join_condition VARCHAR2(10)--����
);

--*********************************/
-- Table Name: ü��  */
--*********************************/
CREATE TABLE userinfo(
		ui_num number PRIMARY KEY,
		u_id VARCHAR2(30) REFERENCES users(u_id),
		ui_weight number,
		ui_height number,
		ui_date DATE
);

--*********************************/
-- Table Name: �αױ��(user) */
--*********************************/
CREATE TABLE userlog(
		ul_num number PRIMARY KEY,
		u_id VARCHAR2(30) REFERENCES users(u_id),
		ul_date TIMESTAMP
);

--*********************************/
-- Table Name: ���ðԽ���(����) */
--*********************************/
CREATE TABLE people(
		p_num number PRIMARY KEY,
		id VARCHAR2(30),
		p_img VARCHAR2(200),
		p_sportsdate varchar2(30),--���¥
		p_sportstime VARCHAR2(20),--��ð�
		p_title VARCHAR2(150),
		p_content CLOB,
		p_zone VARCHAR2(100),--����
		p_hits number--��ȸ��
);

--*********************************/
-- Table Name: ���ðԽ��� ��� */
--*********************************/
CREATE TABLE peoplereple(
		pr_num number PRIMARY KEY,
		p_num number REFERENCES people(p_num),
		id VARCHAR2(30),
		pr_content VARCHAR2(300),
		pr_date TIMESTAMP
);

--*********************************/
-- Table Name: ���̾ */
--*********************************/
CREATE TABLE diary(
		d_num number PRIMARY KEY,
		id VARCHAR2(30),
		d_title VARCHAR2(150),
		d_content CLOB,
		d_date DATE
);

--*********************************/
-- Table Name: ���̾ ��� */
--*********************************/
CREATE TABLE diaryreple(
		dr_num number PRIMARY KEY,
		d_num number REFERENCES diary(d_num),
		id VARCHAR2(30),
		dr_content VARCHAR2(300),
		dr_date TIMESTAMP
);

--*********************************/
-- Table Name: ���̾-�Ĵ� */
--*********************************/
CREATE TABLE diarymenu(
		dm_num number PRIMARY KEY,
		d_num number REFERENCES diary(d_num),
		dm_time VARCHAR2(20),
		dm_img VARCHAR2(200),
		calorie number,
		fat number,
		cardohydrate number,
		cholesterol number,
		protein number
);

--*********************************/
-- Table Name: �����ı�Խ��� */
--*********************************/
CREATE TABLE review(
		r_num number PRIMARY KEY,
		id VARCHAR2(30),
		r_title VARCHAR2(150),
		r_date DATE,
		r_before_img VARCHAR2(200),
		r_after_img VARCHAR2(200),
		r_content CLOB,
		r_hits number
);

--*********************************/
-- Table Name: �����ı���õ�� */
--*********************************/
CREATE TABLE reviewrecommend(
		rr_num number PRIMARY KEY,
		r_num number REFERENCES review(r_num),
		id VARCHAR2(30)
);

--*********************************/
-- Table Name: �����ı��� */
--*********************************/
CREATE TABLE reviewreple(
		rre_num number PRIMARY KEY,
		r_num number REFERENCES review(r_num),
		id VARCHAR2(30),
		rre_content VARCHAR2(300),
		rre_date TIMESTAMP
);

--*********************************/
-- Table Name: ��&���Ͽ�ī�װ� */
--*********************************/
CREATE TABLE tipcategory(
		tcate_num number PRIMARY KEY,
		tcate_name VARCHAR2(50)
);

--*********************************/
-- Table Name: ��&���Ͽ� */
--*********************************/
CREATE TABLE tiptitle(
		tip_num number PRIMARY KEY,
		tcate_num number REFERENCES tipcategory(tcate_num),
		id VARCHAR2(30),
		tip_title VARCHAR2(150),
		tip_content CLOB,
		tip_date DATE,
		tip_hits number
);

--*********************************/
-- Table Name: ��&���Ͽ�Խ��Ǵ�� */
--*********************************/
CREATE TABLE tipreple(
		tr_num number PRIMARY KEY,
		tip_num number REFERENCES tiptitle(tip_num),
		id VARCHAR2(30),
		tr_content VARCHAR2(300),
		tr_date TIMESTAMP
);

--*********************************/
-- Table Name: ��&���Ͽ� ��õ�� */
--*********************************/
CREATE TABLE tiprecommend(
		trc_num number PRIMARY KEY,
		tip_num number REFERENCES tiptitle(tip_num),
		id VARCHAR2(30)
);

--*********************************/
-- Table Name: �����Խ��� */
--*********************************/
CREATE TABLE freetitle(
		free_num number PRIMARY KEY,
		id VARCHAR2(30),
		f_title VARCHAR2(150),
		f_content CLOB,
		f_date DATE,
		f_hits number
);

--*********************************/
-- Table Name: �����Խ��Ǵ�� */
--*********************************/
CREATE TABLE freereple(
		fr_num number PRIMARY KEY,
		free_num number REFERENCES freetitle(free_num),
		id VARCHAR2(30),
		fr_content VARCHAR2(300),
		fr_date TIMESTAMP
);

--*********************************/
-- Table Name: �����Խ��� ��õ�� */
--*********************************/
CREATE TABLE freerecommend(
		frc_num number PRIMARY KEY,
		free_num number REFERENCES freetitle(free_num),
		id VARCHAR2(30)
);

--*********************************/
-- Table Name: ���ǻ���ī�װ� */
--*********************************/
CREATE TABLE questioncategory(
		qcate_num number PRIMARY KEY,
		qcate_name VARCHAR2(50)
);

--*********************************/
-- Table Name: 1:1���ǰԽ��� */
--*********************************/
CREATE TABLE questionboard(
		q_num number PRIMARY KEY,
		id VARCHAR2(30),
		qcate_num number REFERENCES questioncategory(qcate_num),
		q_title VARCHAR2(150),
		q_content CLOB,
		q_img VARCHAR2(200),
		q_date DATE
);

--*********************************/
-- Table Name: 1:1���Ǵ�� */
--*********************************/
CREATE TABLE questionreple(
		qr_num number PRIMARY KEY,
		q_num number REFERENCES questionboard(q_num),
		admin_id VARCHAR2(30),
		qr_content VARCHAR2(300),
		qr_date TIMESTAMP
);

--*********************************/
-- Table Name: �������� */
--*********************************/
CREATE TABLE admins(
		admin_id VARCHAR2(30) PRIMARY KEY,
		admin_pwd VARCHAR2(30),
		admin_date DATE
);

--*********************************/
-- Table Name: ������ �αױ�� */
--*********************************/
CREATE TABLE adminlog(
		admin_num number PRIMARY KEY,
		admin_id VARCHAR2(30) REFERENCES admins(admin_id),
		admin_date TIMESTAMP
);

--*********************************/
-- Table Name: ������Ÿ�� */
--*********************************/
CREATE TABLE videocategory(
		vcate_num number PRIMARY KEY,
		vcate_name VARCHAR2(50)
);

--*********************************/
-- Table Name: ������Խ��� */
--*********************************/
CREATE TABLE video(
		v_num number PRIMARY KEY,
		admin_id VARCHAR2(30) REFERENCES admins(admin_id),
		vcate_num number REFERENCES videocategory(vcate_num),
		v_title VARCHAR2(100),
		v_link VARCHAR2(100),
		v_image VARCHAR2(100),
		v_content clob,
		v_hits number
);

--*********************************/
-- Table Name: �����Խ��� */
--*********************************/
CREATE TABLE notification(
		noti_num number PRIMARY KEY,
		admin_id VARCHAR2(30) REFERENCES admins(admin_id),
		noti_title VARCHAR2(150),
		noti_content CLOB,
		noti_hits number,
		noti_date DATE
);

--*********************************/
-- Table Name: ��ü */
--*********************************/
CREATE TABLE business(
		b_num number PRIMARY KEY,
		t_id VARCHAR2(30) REFERENCES trainers(t_id),--Ʈ���̳ʾ��̵�
		b_corporatenum VARCHAR2(15),--����ڹ�ȣ
		b_name VARCHAR2(100),--��ü�̸�
		b_addr VARCHAR2(100),--��ü�ּ�
		zipcode VARCHAR2(7),
		b_phone VARCHAR2(20),
		b_email VARCHAR2(45),
		b_content VARCHAR2(300),
		b_x number,--x��ǥ
		b_y number,--y��ǥ
		b_condition number, --��ϻ���
		b_date DATE
);

--*********************************/
-- Table Name: ��ü�̹��� */
--*********************************/
CREATE TABLE businessimg(
		bi_num number PRIMARY KEY,
		b_num number REFERENCES business(b_num),
		bi_img VARCHAR2(200)
);

--*********************************/
-- Table Name: �̹����ӽú��� */
--*********************************/
CREATE TABLE temporaryimg(
		ti_num number PRIMARY KEY,
		ti_originalname VARCHAR2(100),
		ti_savaname VARCHAR2(100),
		ti_date DATE
);


--*********************************/
-- Table Name: ���� */
--*********************************/
CREATE TABLE food(
		num number PRIMARY KEY,
		name VARCHAR2(100),
		kcal number,
		tan number,
		dan number,
		ji number,
		col number
);

--*********************************/
-- Table Name: FAQ */
--*********************************/
CREATE TABLE faq(
		faq_num number PRIMARY KEY,
		faq_cate VARCHAR2(50),
		faq_question VARCHAR2(100),
		faq_answer VARCHAR2(600),
		faq_date DATE
);

--*********************************/
-- Table Name: �ּ� */
--*********************************/
CREATE TABLE post(
		zipcode VARCHAR2(10),
		sido VARCHAR2(50),
		gugun VARCHAR2(100),
		dong VARCHAR2(100),
		bunji VARCHAR2(50),
		seq number,
		PRIMARY KEY(seq)
);

--*********************************/
-- Table Name: ���� */
--*********************************/
CREATE TABLE msg(
		msg_num number PRIMARY KEY,
		msg_send_id VARCHAR2(300),
		msg_receive_id VARCHAR2(300),
		msg_title VARCHAR2(150),
		msg_content CLOB,
		msg_date TIMESTAMP,
		msg_condition number
);
 

--*********************************/
-- Table Name: Ż�� 
--*********************************/
CREATE TABLE out(
		out_num number PRIMARY KEY,--��ȣ
		id VARCHAR2(30) ,--���̵�
		out_reason VARCHAR2(90),--����		
		out_date DATE--Ż����
);
