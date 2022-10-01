-- Table Name: 고객(user)

-- Table Name: 트레이너

-- Table Name: 로그기록(트레이너) 
INSERT INTO trainerslog VALUES(trainerslog_SEQ.NEXTVAL,'likesun','13/10/01');
INSERT INTO trainerslog VALUES(trainerslog_SEQ.NEXTVAL,'likesun','13/10/02');
INSERT INTO trainerslog VALUES(trainerslog_SEQ.NEXTVAL,'likesun','13/10/29');
INSERT INTO trainerslog VALUES(trainerslog_SEQ.NEXTVAL,'sinsung','13/12/01');
INSERT INTO trainerslog VALUES(trainerslog_SEQ.NEXTVAL,'sinsung','13/12/02');
INSERT INTO trainerslog VALUES(trainerslog_SEQ.NEXTVAL,'sinsung','13/12/03');
INSERT INTO trainerslog VALUES(trainerslog_SEQ.NEXTVAL,'sinsung','13/12/04');
INSERT INTO trainerslog VALUES(trainerslog_SEQ.NEXTVAL,'sinsung','13/12/05');
INSERT INTO trainerslog VALUES(trainerslog_SEQ.NEXTVAL,'sinsung','13/12/06');
INSERT INTO trainerslog VALUES(trainerslog_SEQ.NEXTVAL,'sinsung','13/12/07');


-- Table Name: 추천식단 

-- Table Name: 조인상태 
INSERT INTO join VALUES(join_SEQ.NEXTVAL, 'trainer1', 'user2', sysdate, 'false');
INSERT INTO join VALUES(join_SEQ.NEXTVAL, 'trainer1', 'cjesjihyo', sysdate,'false');
INSERT INTO join VALUES(join_SEQ.NEXTVAL, 'trainer1', 'anadainlove', sysdate,'false');
INSERT INTO join VALUES(join_SEQ.NEXTVAL, 'trainer1', 'actorlmh', sysdate,'false');
INSERT INTO join VALUES(join_SEQ.NEXTVAL, 'trainer1', 'only190yj', sysdate,'false');
INSERT INTO join VALUES(join_SEQ.NEXTVAL, 'trainer1', '21flower', sysdate,'false');
INSERT INTO join VALUES(join_SEQ.NEXTVAL, 'trainer1', 'honeylee0302', sysdate,'false');
INSERT INTO join VALUES(join_SEQ.NEXTVAL, 'trainer1', 'sujung7287', sysdate,'false');
INSERT INTO join VALUES(join_SEQ.NEXTVAL, 'trainer1', 'kyungholove', sysdate,'false');
INSERT INTO join VALUES(join_SEQ.NEXTVAL, 'trainer1', 'jungwoo109', sysdate,'false');
INSERT INTO join VALUES(join_SEQ.NEXTVAL, 'trainer1', 'bianbian', sysdate,'false');
INSERT INTO join VALUES(join_SEQ.NEXTVAL, 'trainer1', 'susu99', sysdate,'false');
INSERT INTO join VALUES(join_SEQ.NEXTVAL, 'trainer1', 'official', sysdate,'false');


-- Table Name: 체중  
INSERT INTO userinfo VALUES(userinfo_SEQ.NEXTVAL,'user1',60,160,'13/11/01');
INSERT INTO userinfo VALUES(userinfo_SEQ.NEXTVAL,'user1',58,160,'13/11/05');
INSERT INTO userinfo VALUES(userinfo_SEQ.NEXTVAL,'user1',59,160,'13/11/08');
INSERT INTO userinfo VALUES(userinfo_SEQ.NEXTVAL,'user1',58,160,'13/11/15');
INSERT INTO userinfo VALUES(userinfo_SEQ.NEXTVAL,'user1',57,160,'13/11/22');
INSERT INTO userinfo VALUES(userinfo_SEQ.NEXTVAL,'user1',56,160,'13/11/25');
INSERT INTO userinfo VALUES(userinfo_SEQ.NEXTVAL,'user1',55,160,'13/12/27');
INSERT INTO userinfo VALUES(userinfo_SEQ.NEXTVAL,'user1',56,160,'14/01/01');
INSERT INTO userinfo VALUES(userinfo_SEQ.NEXTVAL,'user1',55,160,'14/01/03');
INSERT INTO userinfo VALUES(userinfo_SEQ.NEXTVAL,'user1',57,160,'14/01/06');
INSERT INTO userinfo VALUES(userinfo_SEQ.NEXTVAL,'user1',54,160,'14/01/07');
INSERT INTO userinfo VALUES(userinfo_SEQ.NEXTVAL,'user1',53,160,'14/01/08');
INSERT INTO userinfo VALUES(userinfo_SEQ.NEXTVAL,'user1',52,160,'14/01/10');
INSERT INTO userinfo VALUES(userinfo_SEQ.NEXTVAL,'user1',50,160,'14/01/09');
INSERT INTO userinfo VALUES(userinfo_SEQ.NEXTVAL,'user1',47,160,'14/01/11');


-- Table Name: 로그기록(user) 
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user1','13/11/01');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user1','13/11/05');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user1','13/11/08');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user1','13/11/15');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user1','13/11/22');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user1','13/12/27');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user1','14/01/01');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user1','14/01/02');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user1','14/01/03');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user1','14/01/11');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user1','14/01/12');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user1','14/01/02');

INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user2','13/11/07');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user2','13/11/10');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user2','13/11/07');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user2','13/11/08');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user2','13/11/10');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user2','14/01/03');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user2','14/01/05');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user2','14/01/10');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user2','14/01/12');
INSERT INTO userlog VALUES(userlog_SEQ.NEXTVAL,'user2','14/01/13');


-- Table Name: 피플게시판(유저) 
INSERT INTO people VALUES(people_SEQ.NEXTVAL,'user1',null,'14/12/23','10:30','같이운동해요','같이 운동해요~~~~~~~','서울 종로근처',5);
INSERT INTO people VALUES(people_SEQ.NEXTVAL,'user2',null,'14/01/02','02:30','운동친구구합니다','함께운동할 운동친구 구해요~','서울 성북구',8);
INSERT INTO people VALUES(people_SEQ.NEXTVAL,'vora07',null,'14/01/02','02:30','헬스같이하실분??','아침마다 운동해요~','서울 명동',1);
INSERT INTO people VALUES(people_SEQ.NEXTVAL,'GGbb6363',null,'14/01/02','02:30','같이 살빼실분~','같이 살빼실분~','서울 명동',1);
INSERT INTO people VALUES(people_SEQ.NEXTVAL,'ggbaby',null,'14/01/02','02:30','매일 1시간씩 달리기 하실분','매일 1시간씩 달리기 하실분','서울 명동',1);
INSERT INTO people VALUES(people_SEQ.NEXTVAL,'ssalrang1004',null,'14/01/02','02:30','헬스장 같이 다니실분~','헬스장 같이 다니실분~','서울 명동',1);
INSERT INTO people VALUES(people_SEQ.NEXTVAL,'cultwoTG',null,'14/01/02','02:30','같이 운동 합시다~','같이 운동 합시다~','서울 명동',1);
INSERT INTO people VALUES(people_SEQ.NEXTVAL,'lovely1004',null,'14/01/02','02:30','3명정도 같이 운동하실분','3명정도 같이 운동하실분','서울 명동',1);
INSERT INTO people VALUES(people_SEQ.NEXTVAL,'healinglove',null,'14/01/02','02:30','주말마다 운동하실분!','주말마다 운동하실분!','서울 명동',1);
INSERT INTO people VALUES(people_SEQ.NEXTVAL,'lovelove',null,'14/01/02','02:30','같이 운동해요!','같이 운동해요!','서울 명동',1);
INSERT INTO people VALUES(people_SEQ.NEXTVAL,'official',null,'14/01/02','02:30','아침마다 조깅하실분!!','아침마다 조깅하실분!!','서울 명동',1);

-- Table Name: 피플게시판 댓글
INSERT INTO peoplereple VALUES(peoplereple_SEQ.NEXTVAL,1,'anadainlove','저도종로살아요!같이해요',sysdate);
INSERT INTO peoplereple VALUES(peoplereple_SEQ.NEXTVAL,1,'actorlmh','시간이안맞네여ㅠㅠ',sysdate);

-- Table Name: 다이어리

-- Table Name: 다이어리 댓글 

-- Table Name: 다이어리-식단 

-- Table Name: 성공후기게시판

-- Table Name: 성공후기추천인 

-- Table Name: 성공후기댓글 

-- Table Name: 팁&노하우카테고리 
INSERT INTO tipcategory VALUES(tipcategory_SEQ.NEXTVAL,'다이어트');
INSERT INTO tipcategory VALUES(tipcategory_SEQ.NEXTVAL,'식단');
INSERT INTO tipcategory VALUES(tipcategory_SEQ.NEXTVAL,'운동법');

-- Table Name: 팁&노하우
INSERT INTO tiptitle VALUES(tiptitle_SEQ.NEXTVAL,1,'user1','바나나 다이어트!!', '바나나랑 물한잔이면 포만감 대박~',sysdate,0);
INSERT INTO tiptitle VALUES(tiptitle_SEQ.NEXTVAL,2,'cjesjihyo','다이어트 식단은 이렇게~', '바나나랑 물한잔이면 포만감 대박~',sysdate,0);
INSERT INTO tiptitle VALUES(tiptitle_SEQ.NEXTVAL,1,'love7317','아메리카노 마시고 살빼자', '바나나랑 물한잔이면 포만감 대박~',sysdate,0);
INSERT INTO tiptitle VALUES(tiptitle_SEQ.NEXTVAL,3,'actorlmh','이런 운동 해보세요~', '바나나랑 물한잔이면 포만감 대박~',sysdate,0);
INSERT INTO tiptitle VALUES(tiptitle_SEQ.NEXTVAL,1,'only190yj','살빼자!', '바나나랑 물한잔이면 포만감 대박~',sysdate,0);
INSERT INTO tiptitle VALUES(tiptitle_SEQ.NEXTVAL,2,'21flower','채소만 먹었어요~', '바나나랑 물한잔이면 포만감 대박~',sysdate,0);
INSERT INTO tiptitle VALUES(tiptitle_SEQ.NEXTVAL,1,'honeylee0302','다이어트는 이렇게 하세요.', '바나나랑 물한잔이면 포만감 대박~',sysdate,0);
INSERT INTO tiptitle VALUES(tiptitle_SEQ.NEXTVAL,3,'sujung7287','뱃살 저리가라~!', '바나나랑 물한잔이면 포만감 대박~',sysdate,0);
INSERT INTO tiptitle VALUES(tiptitle_SEQ.NEXTVAL,2,'kyungholove','1일 1식', '바나나랑 물한잔이면 포만감 대박~',sysdate,0);
INSERT INTO tiptitle VALUES(tiptitle_SEQ.NEXTVAL,3,'jungwoo109','나만의 운동방법!', '바나나랑 물한잔이면 포만감 대박~',sysdate,0);
INSERT INTO tiptitle VALUES(tiptitle_SEQ.NEXTVAL,1,'bianbian','무조건 빠진다!', '바나나랑 물한잔이면 포만감 대박~',sysdate,0);

-- Table Name: 팁&노하우게시판댓글 
INSERT INTO tipreple VALUES(tipreple_SEQ.NEXTVAL,1,'user2','유용한정보네요',sysdate);

-- Table Name: 팁&노하우 추천인 
INSERT INTO tiprecommend VALUES(tiprecommend_SEQ.NEXTVAL,1,'user2');


-- Table Name: 자유게시판
INSERT INTO freetitle VALUES(freetitle_SEQ.NEXTVAL,'user1','유용한정보들이 많네요!','하이하이반가워요','13/12/01',15);
INSERT INTO freetitle VALUES(freetitle_SEQ.NEXTVAL,'user2','안녕하세요~','하이하이반가워요','13/12/03',10);
INSERT INTO freetitle VALUES(freetitle_SEQ.NEXTVAL,'cjesjihyo','운동을 할려구요.. ','하이하이반가워요','14/01/13',3);
INSERT INTO freetitle VALUES(freetitle_SEQ.NEXTVAL,'anadainlove','올해 50되는 사람입니다','하이하이반가워요','14/01/15',3);
INSERT INTO freetitle VALUES(freetitle_SEQ.NEXTVAL,'actorlmh','몸짱되고싶어요~','하이하이반가워요','14/01/16',5);
INSERT INTO freetitle VALUES(freetitle_SEQ.NEXTVAL,'only190yj','헬스클럽~~~~~!!!???','하이하이반가워요','14/01/16',15);
INSERT INTO freetitle VALUES(freetitle_SEQ.NEXTVAL,'honeylee0302','혼자하기 좋은 운동 뭐가 있나요?','하이하이반가워요','14/01/17',8);
INSERT INTO freetitle VALUES(freetitle_SEQ.NEXTVAL,'21flower','애플짐헬스장 가보신분?','하이하이반가워요','14/01/17',3);
INSERT INTO freetitle VALUES(freetitle_SEQ.NEXTVAL,'sujung7287','오늘의유머~','하이하이반가워요','14/01/17',2);
INSERT INTO freetitle VALUES(freetitle_SEQ.NEXTVAL,'kyungholove','헬스장선택할때요!','하이하이반가워요','14/01/17',1);
INSERT INTO freetitle VALUES(freetitle_SEQ.NEXTVAL,'jungwoo109','살이안빠져요ㅠㅠ','하이하이반가워요','14/01/17',4);
INSERT INTO freetitle VALUES(freetitle_SEQ.NEXTVAL,'bianbian','수영하고있어요~','하이하이반가워요',sysdate,5);
INSERT INTO freetitle VALUES(freetitle_SEQ.NEXTVAL,'susu99','팔근육어떻게 만드나요?','하이하이반가워요',sysdate,3);
INSERT INTO freetitle VALUES(freetitle_SEQ.NEXTVAL,'official','어떤운동이 좋을까요?','하이하이반가워요',sysdate,1);

-- Table Name: 자유게시판댓글
INSERT INTO freereple VALUES(freereple_SEQ.NEXTVAL,1,'user2','어서오세요~','13/12/02');
INSERT INTO freereple VALUES(freereple_SEQ.NEXTVAL,1,'user3','반가워요','13/12/02');
INSERT INTO freereple VALUES(freereple_SEQ.NEXTVAL,1,'user4','친하게지내요','13/12/03');
INSERT INTO freereple VALUES(freereple_SEQ.NEXTVAL,2,'user3','방가','13/12/03');
INSERT INTO freereple VALUES(freereple_SEQ.NEXTVAL,2,'user4','친하게지내요','13/12/03');


-- Table Name: 자유게시판 추천인 
INSERT INTO freerecommend VALUES(freerecommend_SEQ.NEXTVAL,1,'user2');
INSERT INTO freerecommend VALUES(freerecommend_SEQ.NEXTVAL,1,'user3');
INSERT INTO freerecommend VALUES(freerecommend_SEQ.NEXTVAL,1,'user4');
INSERT INTO freerecommend VALUES(freerecommend_SEQ.NEXTVAL,2,'user3');

-- Table Name: 문의사항카테고리
INSERT INTO questioncategory VALUES(1,'가입/탈퇴');
INSERT INTO questioncategory VALUES(2,'홈페이지이용');
INSERT INTO questioncategory VALUES(3,'홈페이지오류');
INSERT INTO questioncategory VALUES(4,'기타');


-- Table Name: 1:1문의게시판 
INSERT INTO questionboard VALUES(questionboard_SEQ.NEXTVAL,'user1',3,'게시판...','글이안써짐...',null,sysdate);
INSERT INTO questionboard VALUES(questionboard_SEQ.NEXTVAL,'glory1004',1,'탈퇴는어디서하나요??','탈퇴하고싶음',null,sysdate);
INSERT INTO questionboard VALUES(questionboard_SEQ.NEXTVAL,'vora07',2,'트레이너 매칭 방법 문의합니다','트레이너 매칭 방법 문의합니다',null,sysdate);

-- Table Name: 1:1문의댓글 
INSERT INTO questionreple VALUES(questionreple_SEQ.NEXTVAL,1,'admin','새로고침해보세요',sysdate);
INSERT INTO questionreple VALUES(questionreple_SEQ.NEXTVAL,2,'admin','탈퇴는....',sysdate);
INSERT INTO questionreple VALUES(questionreple_SEQ.NEXTVAL,2,'admin','피플->트레이너 에서 할 수 있습니다.',sysdate);

-- Table Name: 웹관리자 
INSERT INTO admins VALUES('admin','123','13/05/05');

-- Table Name: 관리자 로그기록 
INSERT INTO adminlog VALUES(adminlog_SEQ.NEXTVAL,'admin','13/05/05');
INSERT INTO adminlog VALUES(adminlog_SEQ.NEXTVAL,'admin','13/06/05');
INSERT INTO adminlog VALUES(adminlog_SEQ.NEXTVAL,'admin','13/07/05');
INSERT INTO adminlog VALUES(adminlog_SEQ.NEXTVAL,'admin','13/10/05');
INSERT INTO adminlog VALUES(adminlog_SEQ.NEXTVAL,'admin','13/11/05');


-- Table Name: 동영상타입 
INSERT INTO videocategory VALUES(1,'광배근');
INSERT INTO videocategory VALUES(2,'대내외전근');
INSERT INTO videocategory VALUES(3,'대둔근');
INSERT INTO videocategory VALUES(4,'대퇴사두근');
INSERT INTO videocategory VALUES(5,'대흉근');
INSERT INTO videocategory VALUES(6,'대퇴이두근');
INSERT INTO videocategory VALUES(7,'복근');
INSERT INTO videocategory VALUES(8,'비복근');
INSERT INTO videocategory VALUES(9,'삼각근');
INSERT INTO videocategory VALUES(10,'상완삼두근');
INSERT INTO videocategory VALUES(11,'상완이두근');
INSERT INTO videocategory VALUES(12,'승모근');
INSERT INTO videocategory VALUES(13,'전완근');
INSERT INTO videocategory VALUES(14,'척추기립근');

-- Table Name: 동영상게시판 
-- Table Name: 동영상게시판 
INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',1,
'덤벨로우',
'//www.youtube.com/embed/Deu1Tt5yGdA',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/408a63b3407c856d4b68e868c5c801841.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/cc68982f407076cd68d35720886f0f46.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/09/29869b938f41ea9e4228b213b3a0340b.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',1,
'덤벨풀오버',
'//www.youtube.com/embed/L_-mHWYybEA',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/d9545b02b89beaa143930aa96f4c3ee71.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/cc68982f407076cd68d35720886f0f46.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/14ea3ff65711911405a8ed9752b80173.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',1,
'랫풀다운-프론트',
'//www.youtube.com/embed/09-oYTUe6pA',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/b7edd3fd22c541db2590ebf9f0f053741.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/cc68982f407076cd68d35720886f0f46.jpg''/><br/>
',
0);


INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',1,
'렛풀다운-백',
'//www.youtube.com/embed/fEycObABQ6U',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/f8b8f261871925ceba0bdebc6fa9184c1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/08/29/558b9623e08932ada932d8d22468cd12.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',1,
'렛풀다운-크로즈그립',
'//www.youtube.com/embed/5LBF2jeZknI',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/bb679904a7f28491750ec9a4867796091.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/cc68982f407076cd68d35720886f0f46.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',1,
'바벨로우',
'//www.youtube.com/embed/mZymw96wl1M',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/d9545b02b89beaa143930aa96f4c3ee71.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/cc68982f407076cd68d35720886f0f46.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/09/d0667cbc5d093ded65c943fe53cca0df.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',1,
'바벨풀오버',
'//www.youtube.com/embed/1UC-ZMfdzg4',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/d9545b02b89beaa143930aa96f4c3ee71.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/cc68982f407076cd68d35720886f0f46.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/09/ac35c3084c97789fd6a3c129a7314c84.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',1,
'시티드덤벨로우',
'//www.youtube.com/embed/dBkvNY44LMw',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/f498d985342271f024831bee7fedb9c01.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/cc68982f407076cd68d35720886f0f46.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',1,
'양팔대각선으로당기기',
'//www.youtube.com/embed/mIZwwNJqN3A',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/f498d985342271f024831bee7fedb9c01.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/cc68982f407076cd68d35720886f0f46.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',1,
'양팔등뒤로당기기',
'//www.youtube.com/embed/QdQWHzxgO1c',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/bedc05f54187c8be003069c19f0173541.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/cc68982f407076cd68d35720886f0f46.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',1,
'원암덤벨로우',
'//www.youtube.com/embed/1oMNsum3Aoc',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/8e8b9156c8872b563f44f5f5c012f32b1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/fb2cdf0a9880aebb57f21dd31d629b9e.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/09/9366a2f230381c1f01756e87f8044c37.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',2,
'다리옆으로올리기',
'//www.youtube.com/embed/--ByqHbb_sI',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/03c9bf1b4e1eb5810676d408bccac5931.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/25566e3d251e40aa296c383c0ee4a53f.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',2,
'멀티힙-아웃',
'//www.youtube.com/embed/mUGesSBxIqM',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/f66f5680d1da31d70531ed19fd44d0421.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/c721e423c8be05d867bca6840c6b3587.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/09/bd49896ac37c9bf4a1e2a4a1aed43d08.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',2,
'멀티힙-인너',
'//www.youtube.com/embed/6iUltohAr_Q',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/227ac72033cca3383ad87730de9f65f31.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/543aa6261c7a0d9bcaa597ebd71a0fae.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/09/f4aeb0f706dacb260fa7116fe5114f60.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',2,
'아랫다리위로올리기',
'//www.youtube.com/embed/zbYbTap5RLU',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/019166cbd62a415098dbcbf96ed3d3d21.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/1aa1d6e8a9fe78c533e88d4041d5a6c9.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',2,
'양무릎으로공모으기',
'//www.youtube.com/embed/qRnJh_0RpQ0',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/8f996aafa35cab4b033dfc7be1cce4ff1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/774f7ecb39884ebd11dda7550f6d009e.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',3,
'다리굽혀위로밀기',
'//www.youtube.com/embed/OqIomNJCXX8',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/c2d604df2f9223127d52ab8597587fcf1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/2842efffc4dc3e534c0c78497d2c0905.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/361bf7b10dd017485e7bdf745628aff1.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',3,
'다리펴서위로밀기',
'//www.youtube.com/embed/OVWyaiKpZro',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/610dd55ce2efd0f8571374da171ce9961.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/2842efffc4dc3e534c0c78497d2c0905.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/361bf7b10dd017485e7bdf745628aff1.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',3,
'바벨데드리프트',
'//www.youtube.com/embed/1cloXydOg0g',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/056933e7474b11866121fc819127bd4a1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/fcf0039917bedcac528eac7a54a2d31a.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/f36a48c2cae97ff29d6ed04ccd821473.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/7e757cd01735b3f698ad4fd712f38ef8.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',3,
'엉덩이들어올리기',
'//www.youtube.com/embed/yYeHbksGW9k',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/1380176004e8372162ae30b7c89e1fe31.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/9bea770fac0688ff8f77df88e94b9469.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/4f4c7731897e352cecdbc29031e58c1e.jpg''/><br/>
',
0);


INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',3,
'덤벨데드리프트',
'//www.youtube.com/embed/FQmXSqoYQRE',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/25d84447f522720d0f3efb9df6b76f0c1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/464d22b93ea53950dfa1f2de17765666.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/1f813a7614b23824eaac174a8e3a8a04.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',4,
'덤벨스쿼트',
'//www.youtube.com/embed/ktSJmavr9a0',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/b3632104cba59689e3011546a5d5ee471.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/4e24acee9060a1994a0d15aee5223bb6.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',4,
'런지',
'//www.youtube.com/embed/AVvF4tdAB4k',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/ec12eab890cc21a14dde9ab1bd0650031.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/7963482da76cd651e054314eb0464a16.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/09/03cc80e055a45f5df2fa9e2617b6b405.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',4,
'무릎굽혀앉았다일어서기',
'//www.youtube.com/embed/65SJMXVxgrM',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/7b3b21c330b836f846bf5baf224c9ff71.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/765948086de2f295bec55552e133defe.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',4,
'사이드런지',
'//www.youtube.com/embed/ih2sU8agUY4',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/56a5accb9f8af104c1a3499d1202dba71.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/777f438152e3cbc49c72da6505bfd9d9.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/09/b27884942be1d4a9f065f4e6a75e97b2.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',4,
'와이드스쿼트',
'//www.youtube.com/embed/pMpthwg1tNY',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/85db5907c5237830e5d0a4f85aef9edd1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/2dd2830296b57d5ecab63e8a46c6e967.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',4,
'풀스쿼트',
'//www.youtube.com/embed/w8HW6nVXmZk',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/70ea60cc59c6fc179a55817aac9852ee1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/b7bc16690634b3c2e50e728ac7f8708a.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',4,
'하프스쿼트',
'//www.youtube.com/embed/J1GDYFPdkMk',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/8a4cb47649c4967756f37e01b409f0751.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/2ac8fc776002716b298e323d89a8950b.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',4,
'한쪽다리앞으로올리기',
'//www.youtube.com/embed/69b4Ve3mkNA',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/86a91abeedb4dc031f0abc5f970f3f501.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/d082d9b1dad2c31e05bb7fdde32b036f.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',5,
'덤벨레터럴레이즈',
'//www.youtube.com/embed/tWhs-2foles',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/fa639c67d1d94a0e049406e0c257ca5d1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/873106807724bced37bef681864511bf.jpg''/><br/>
',
0);
INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',5,
'덤벨풀오버-체스트',
'//www.youtube.com/embed/eDxNvyhWamI',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/d5d3e5b3c22e484d8e89bb6cbbf5fe6e1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/18a1449abf9b77f15c8a9a93772d1cb8.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',5,
'덤벨프레스',
'//www.youtube.com/embed/9RNPIRwfpmw',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/aba79942513756588b182bf5b956b6911.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/69d84b6b293b6c803120d568350ce237.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/ea6637223a39df86f067fab8ee4cf64f.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',5,
'덤벨플라이',
'//www.youtube.com/embed/7dNHMrWyWak',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/01da63e27a37b14d207d91b236fb18761.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/ec9ef5a112b3de891f12d82acdadb35e.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/0dbd7f6f4d9b5941d79316ccadcfbe2b.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',5,
'무릎대고팔굽혀펴기',
'//www.youtube.com/embed/I81O3nR7tWY',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/a1a2a3d69a363177723a8185c058c0b21.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/a32d33d66026316ce4c0cb8386fe9e35.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',5,
'벤치프레스',
'//www.youtube.com/embed/VB-fMNEeQYE',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/81877209823c06a973bbe64c21b42fc91.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/aabee43e62b05bf6dc1c659d03493164.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/07/6fa2d68b63d007005b7608649aa0dbb9.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',5,
'인클라인덤벨프레스',
'//www.youtube.com/embed/sTNZnnDxVDU',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/48fd8a91e42fa2f7bbac0b53f5002da51.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/aa4ebda5be53d7dd347053a62e12cd4d.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',5,
'인클라인덤벨플라이',
'//www.youtube.com/embed/qWl_FqIHTt0',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/591752132652deba7e3a8f1987b518d31.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/2be34e32636e1431d3c2e7976c7c13b0.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',5,
'인클라인바벨프레스',
'//www.youtube.com/embed/NgOw_V43Ps8',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/a297a13dc6990d1b6dfaca9e110feb3a1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/1127bd9893a7e1d27b3a7e4e137e7ca5.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',5,
'케이블크로스오버',
'//www.youtube.com/embed/V0R6oAeRjuU',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/dab0bcca6bb99ea0e9b1d15008038dd71.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/d800f3ff816a14e3b8ef75213ed624c3.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',5,
'푸쉬업',
'//www.youtube.com/embed/4Qo9GpZhb74',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/575e8693a95e6d4cd31889450ce949311.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/eb730c86bf6d31968ab5f2477580cc3c.jpg''/><br/>
',
0);


INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',6,
'다리굽혀위로밀기',
'//www.youtube.com/embed/OqIomNJCXX8',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/c2d604df2f9223127d52ab8597587fcf1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/bfc96ef02ef5ed70e33b9cad3dd668c9.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/216164241818f706d15216d4ae1eed86.jpg''/><br/>
',
0);


INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',6,
'다리펴서위로밀기',
'//www.youtube.com/embed/OVWyaiKpZro',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/610dd55ce2efd0f8571374da171ce9961.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/2842efffc4dc3e534c0c78497d2c0905.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/361bf7b10dd017485e7bdf745628aff1.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',7,
'니업',
'//www.youtube.com/embed/59dtW5ROnT4',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/b367754c6820a7cc0842a726d13b04031.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/806f43b20aaf3c6d04482c132d84f904.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/09/5605431f1da3e7814f364058b9393633.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',7,
'등대고밀기',
'//www.youtube.com/embed/dAokSnxXDWc',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/062b47013c317e0b3b9ec3e93dccf6dc1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/4392b08bd2ae69c820802d7b278c423a.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',7,
'레그레이즈',
'//www.youtube.com/embed/nYXJEjBvrjU',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/594f86589396b983e051a83cbc2f0ddd1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/c936b8e15d5a58fd30499d3c70ea8c73.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/09/dc1d73fa30f9268729ac661bb831d36a.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',7,
'리버스크런치',
'//www.youtube.com/embed/xTKfMfTwjQA',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/fb1c030b73da8ec7380ea6eb7c869da21.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/787125c3c159fabf04c0f9cbf335f685.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/09/835e3388902ace5e02ec2f2a36c1a892.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',7,
'사이드밴드',
'//www.youtube.com/embed/Tz18N9vU6Ek',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/c38cc6a1fe8d7052f638db3fcc5bd9601.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/1497b7722e1e36b19f286aa051e84120.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/09/34b3350ac27e3d04e44fc12fcfeb85e6.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',7,
'싯업',
'//www.youtube.com/embed/eEGZ5l0EK3w',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/232a09ca356c7f1d0e44b41d618c41621.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/da7fac6ff376819e1932b5bc0ef1705f.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/09/0dc0d99fa59e5db1a92432a6a247ec6f.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',7,
'싸이슬라이드크런치',
'//www.youtube.com/embed/EdpCXW-kgug',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/43d587fb1d1270bbda04f34541a82b3a1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/e81e6d8d049a0be07ffc0f754eca2896.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/09/b7cb19215d6aed215a31c6436bb1b7b7.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',7,
'엉덩이들어버티기',
'//www.youtube.com/embed/Lj1m8w_7XmQ',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/6f36619c8e936677686cf35e4bd99d901.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/779bcd7d5527e0bca4979a30e7c535ff.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',7,
'인클라인싯업',
'//www.youtube.com/embed/VjsgVTM-b0U',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/6cf126d3a007443023723efe73d975d31.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/17e53f53e811d75833b86700cca1fd9b.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',7,
'크런치',
'//www.youtube.com/embed/dg2-0_M5cQs',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/657e7877d2f0bc28991ffba7c1bd6dfa1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/2d2354982cfd29cb3d15f3d33677504d.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',7,
'크로스바디크런치',
'//www.youtube.com/embed/zyF5ngx6I8U',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/eaedc475970761e9cc380b77795948cf1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/2119d24435c815641e134f63b970dcf9.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',7,
'턱크런치',
'//www.youtube.com/embed/xuKFVB8Cl_s',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/df8882f1f33c91437dcf5783a32654561.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/d308a6195da6aba5eb0f458692f450af.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',7,
'트위스트크런치',
'//www.youtube.com/embed/HLn0yDLiwls',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/dc90b019e8e986e0b1d78db22e3275aa1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/5f6561e9951198a5efe183541e72f100.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',8,
'바벨카프레이즈',
'//www.youtube.com/embed/dG50XIU2bVY',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/4e8a34b483f1451d0f0ce976a357a3a71.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/a88603a4a35e35baef247957d8674afc.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',8,
'카프레이즈',
'//www.youtube.com/embed/G2b6VS5Gu5s',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/6a9950a0c1e89ccdea3f1751979caff51.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/fa2e014548ddcc15a688a11de8228544.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',9,
'덤벨업라이트로우',
'//www.youtube.com/embed/MGz3jJSeRJY',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/91995f5c867470c9b01330f127cf4a2c1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/fd945cea58a2f3b50458075432e3c9da.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/f38dc37259a512069afb29eefd959353.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',9,
'덤벨오버헤드프레스',
'//www.youtube.com/embed/x2w10ttpnGA',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/f6346f02dc35158c39f4e74aa0f287b61.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/5d9409e496840ceec3b149892c734614.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/fe5dbd9420fa883b3a07ff08b9cd96af.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',9,
'바벨업라이트로우',
'//www.youtube.com/embed/nGYheo9am4A',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/60324c680a2ff9cb3656e149f746df101.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/a1267eeebc28ad8045a44de38cf7da2d.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/70bb05c21fefd6b15d8a0aa8c0a74adc.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',9,
'바벨오버헤드프레스',
'//www.youtube.com/embed/001tQ-9r86s',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/caa4fa3382328c605def065be190a0ce1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/0ed6aa4da5ee011143b4ab8f81fb46c8.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/77cf7da715da642d33492c995231a798.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',9,
'바벨프론트레이즈',
'//www.youtube.com/embed/aDy0LxfYUGU',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/15994d5293b26f1b5dce065d8f1c102c1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/8a04cdcce48eb33a1453db5a76830323.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/e3590d91fb1c9763e7e32aa96a36f78b.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',9,
'벤드오버레터렐레이즈',
'//www.youtube.com/embed/tND55rz0wP8',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/a7c720171a56644ac6897e756cf21d8f1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/3ee76a259308233f6e500d7d7ae65cde.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',9,
'비하인드바벨오버헤드프레스',
'//www.youtube.com/embed/sgTdcKP1Ykk',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/c68e67b61142af6856355cbd9c0fd5df1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/036433436c8fda89131d9de9a4c7c948.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',9,
'사이드레터렐레이즈',
'//www.youtube.com/embed/REVCgzU3eN4',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/ff2cd18444ac10333e9cd100ff8b3f5c1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/4b46eb7c516e418b0152a8b10ab836e6.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',9,
'시티드덤벨오버헤드프레스',
'//www.youtube.com/embed/wOVNFhkacxs',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/1cb500273909d7ada2b1872c334c1ce21.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/603169822d4e856caeb993c68a703e16.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/81dea2c5d6a5bc7d374d9f586b407f27.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',9,
'시티드벤드오버레터럴레이즈',
'//www.youtube.com/embed/jzrtez0-dvw',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/2f8fd1f3cb7f9c8ff2c99fa74575daf91.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/7f4822e4ef9cb492526e3398782a7b98.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',9,
'오버헤드레터럴레이즈',
'//www.youtube.com/embed/MijsxINQJUc',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/82d55e77da963a07b8fe09323b90f48c1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/37dc558e5d0a1f53f49cfb38ed53d313.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/46ef01453fd0a738c9d455b7ced7674e.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',9,
'원암프론트레이즈',
'//www.youtube.com/embed/c81b1Xjks1E',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/d7997f37a3f8e52dfbea82e479a2e9311.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/6fe00079a95745785e11e28fc187f8fd.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',9,
'인클라인레터럴레이즈',
'//www.youtube.com/embed/31O95M_P9s4',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/322abd41b85b4f23dd643c1055a21cc61.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/aa9363770233db0646f8756dc21e03b4.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',9,
'케이블원암레이즈',
'//www.youtube.com/embed/vc1O7AhrtG0',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/ac543a3173a8fb5e71b94e653aa470a61.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/d2fcb567788bfad353aedaef9eae53cd.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',9,
'팔꿈치등뒤로밀기',
'//www.youtube.com/embed/jOJ9FfujDi4',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/310a2fcc24f470395d96bbefc3b8eda61.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/4ffa592efaf2a9459c494cad8381d43b.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',9,
'프론트레이즈',
'//www.youtube.com/embed/2QsXpKBHQFY',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/2a9e806f678c2a5e737b0e0cce837fb31.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/4c7fa2282379fe6c8163eb96f1b61162.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',10,
'덤벨트라이셉스킥백',
'//www.youtube.com/embed/DgUI9eR5fGI',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/6faa389a485771b42fe2dca275d25c771.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/090fb4f7f55d7ca41d78a34b640168bb.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/89ec9b49186c09add55f2bf92369252a.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',10,
'라이닝바벨트라이셉스익스텐션',
'//www.youtube.com/embed/5zA1eFSTVAA',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/7fd46896d2b146d93283afc0413d989a1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/14404f10605c6e1af98e76cd081af1e0.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',10,
'라이닝원암트라이셉스익스텐션',
'//www.youtube.com/embed/FZiDY0KYhPA',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/e840284ab6b54230be98cee086172c031.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/326c276301309f3f927043f435251103.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',10,
'리버스푸쉬다운',
'//www.youtube.com/embed/e75gPl0ebKE',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/e6c77d58e19bf96da094dc9d3ab3d6971.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/fb9cfb8889033586926a8c33db236628.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',10,
'스텐딩바벨트라이셉스익스텐션',
'//www.youtube.com/embed/OnqJYKb9uUI',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/53f54797a607c28fe8d3071f6eb3838d1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/7b00f00137a6ee47085340755be819bf.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/e8de60d321aac5b54435ffab390bc10b.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',10,
'원암트라이셉스익스텐션',
'//www.youtube.com/embed/i6l7Y7fEI50',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/f597bbd5ed55a41b2f8607bd01cca6db1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/bf4808f26b31e45bf16e7b0b72df0026.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',10,
'케이블킥백',
'//www.youtube.com/embed/44gMCqF6CkU',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/4c19c34765dab7a0e3eb73d47d7b6ad61.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/9179f66a8691197778f661f26a88a2f3.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',10,
'투암트라이셉스익스텐션',
'//www.youtube.com/embed/J4aqvbNrr4Q',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/1a89398fe76fae4c0f5ef281efcf33981.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/66d3349d62e4cdab4b802cfad7565b0b.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',10,
'트라이셉스푸쉬다운',
'//www.youtube.com/embed/o8wb10hXnWg',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/2e6495abc27468b2562ca15fafe1a0821.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/8758ff110da12d70a69bd0b319e7f8ee.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',11,
'덤벨스크루컬',
'//www.youtube.com/embed/4B07F_BZt_Y',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/70aedb03cc9c106225cb6e4ffe9973de1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/65edd56c5295cdc9bd8fb5acc718cabf.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/9544cac75e5a0a406aeaecc72ee0c777.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',11,
'덤벨컨센트레이션컬',
'//www.youtube.com/embed/ieFQMw6KRpk',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/ddd13088a7bb08a49778d25efa9682341.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/7649acbba78bd16473c044bd22df5009.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',11,
'덤벨컬',
'//www.youtube.com/embed/gTYk1wf3oEk',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/06d6f00828d18c62ba843174dc9271021.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/c48dedf3878d5deec18acbb25d1ee8cd.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',11,
'덤벨프리처컬',
'//www.youtube.com/embed/_UmIv0mue8o',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/2be4274c72aaf65f70e0ae7c8d3ef93d1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/44e99c84f4dfd025ab48b5f57d5a41a7.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',11,
'리버스바벨컬',
'//www.youtube.com/embed/T0o23vRFzdA',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/08f745c60ffdb77577f53f3f61d96ae11.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/511a39799a5bb7aada8e2fbe1189d07c.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',11,
'바벨컬',
'//www.youtube.com/embed/0PX1byoGlLw',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/08f745c60ffdb77577f53f3f61d96ae11.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/d7870aa4fad0d07b70b6b047587145bf.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',11,
'이지바컬',
'//www.youtube.com/embed/s8nDRSPpvio',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/66b660ad8ac780953b7139818dca84cd1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/e31151c9543171fbcc669a004b003bac.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',11,
'인클라인덤벨컬',
'//www.youtube.com/embed/pqGP3LVLzGY',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/fa345316cf2982e20df58ba4ab9b87b71.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/e073ef630d9c0bd6c10df5a0942d20f2.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',11,
'케이블투핸즈컬',
'//www.youtube.com/embed/ui-EVe5ldjg',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/b929efd8692084cd1f0f94005177e0b51.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/cdd799ab62be8dec9a2907bd37259f6e.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',11,
'헤머컬',
'//www.youtube.com/embed/lHvLPzNLDzg',
'http://img.healthmee.co.kr/upload/motion2/2013/10/08/2b313809011bdfc1dd7333e995d3281c1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/69286547328122e8523e46d20ac20417.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',12,
'덤벨시러그',
'//www.youtube.com/embed/eswi2vcY8wk',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/1d71b0eb83bc30b72e4a95b90b831a421.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/343bdbd9acdeb3737ba5582cfe9d4903.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/8f40852d168cc151482a569038064f9f.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',12,
'바벨시러그',
'//www.youtube.com/embed/J3INZyMSW7c',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/634731799b24eee776f6d1ba9d5cd7261.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/edb9ee56248403a2b7805a089b9ccd0f.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/f08cbdcbeb0226807f0577cb08706374.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',13,
'덤벨리스트컬',
'//www.youtube.com/embed/xyoYVr22VZs',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/91f598c469dc3138ee3b51031ccba8df1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/ae9ba5f047b29d83db691fd687f926c6.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/0d8b32d53bbcfeee687db87ce9ca73c0.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',13,
'리버스덤벨컬',
'//www.youtube.com/embed/SJ_ZnuKZlHA',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/c39d6e9cc967d8a9fd124e7d21b44e7b1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/04e12381215d5b3d9c4a112cab2c05ec.jpg''/><br/>
',
0);
INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',13,
'스텐딩바벨리스트컬',
'//www.youtube.com/embed/ke_fiPf2Mzo',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/bc1feae481c0da4d8a52b0d5ceaa0b8e1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/3a2f05c1641f6e194d330bfe57c4e667.jpg''/><br/>
',
0);
INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',13,
'시티드덤벨리스트컬',
'//www.youtube.com/embed/U5a3UUYrUG8',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/5f257c6cfd204174a95677457e18b2551.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/99a23c9394543ca3b76b3bbf06ba772f.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',14,
'바벨데드리프트',
'//www.youtube.com/embed/1cloXydOg0g',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/056933e7474b11866121fc819127bd4a1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/fcf0039917bedcac528eac7a54a2d31a.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/f36a48c2cae97ff29d6ed04ccd821473.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',14,
'백익스텐션',
'//www.youtube.com/embed/Cxsxhg9Z8Po',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/a4bcb26b0793bc3f29c832dd4fe08b4a1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/79f5f9bbdd44023cd7de983c27c4c6de.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/05/08/0e80527b279c03a32cba953042425857.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',14,
'엉덩이들어올리기',
'//www.youtube.com/embed/yYeHbksGW9k',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/1380176004e8372162ae30b7c89e1fe31.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/9bea770fac0688ff8f77df88e94b9469.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/4f4c7731897e352cecdbc29031e58c1e.jpg''/><br/>
',
0);

INSERT INTO video VALUES(video_SEQ.NEXTVAL,'admin',14,
'덤벨데드리프트 ',
'//www.youtube.com/embed/FQmXSqoYQRE',
'http://img.healthmee.co.kr/upload/motion2/2013/09/30/25d84447f522720d0f3efb9df6b76f0c1.jpg',
'
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/464d22b93ea53950dfa1f2de17765666.jpg''/><br/>
<img src=''http://img.healthmee.co.kr/upload/motion2/2013/10/31/1f813a7614b23824eaac174a8e3a8a04.jpg''/><br/>
',
0);

commit;

commit;

-- Table Name: 공지게시판 
INSERT INTO notification VALUES(notification_SEQ.NEXTVAL,'admin','공지사항입니다.','공지공지공지....',0,'13/10/10');
INSERT INTO notification VALUES(notification_SEQ.NEXTVAL,'admin','공지사항입니다.','공지공지공지....',0,'13/10/15');
INSERT INTO notification VALUES(notification_SEQ.NEXTVAL,'admin','공지사항입니다.','공지공지공지....',0,'13/10/20');
INSERT INTO notification VALUES(notification_SEQ.NEXTVAL,'admin','공지사항입니다.','공지공지공지....',0,'13/11/10');
INSERT INTO notification VALUES(notification_SEQ.NEXTVAL,'admin','공지사항입니다(필독)','공지공지공지....',0,'13/12/01');

-- Table Name: 업체 

-- Table Name: 업체이미지

-- Table Name: FAQ 
INSERT INTO faq VALUES(faq_SEQ.NEXTVAL,'가입/탈퇴','회원가입은 어떻게 하나요?','회원가입은.........','13/01/01');
INSERT INTO faq VALUES(faq_SEQ.NEXTVAL,'홈페이지이용','탈퇴방법은?','탈퇴는.......','13/01/01');
INSERT INTO faq VALUES(faq_SEQ.NEXTVAL,'홈페이지오류','로그인이안되요','로그인.........','13/01/01');

-- Table Name: 쪽지
insert into msg values(msg_seq.nextval, 'user1', 'user2', '안녕하세요?', '안녕???????', sysdate, 2);
insert into msg values(msg_seq.nextval, 'user1', 'user2', '좋은하루~', '잘지내시나요?', sysdate, 1);
insert into msg values(msg_seq.nextval, 'user1', 'user2', '또만나요~', '만나서 반가웠어요~', sysdate, 2);
insert into msg values(msg_seq.nextval, 'user1', 'user2', '뭐해~', '뭐하냐고', sysdate, 1);
insert into msg values(msg_seq.nextval, 'user1', 'user2', '야!', '보면 답장~', sysdate, 2);

insert into msg values(msg_seq.nextval, 'user2', 'user1', 'user2의 답장1', '안녕???????', sysdate, 1);
insert into msg values(msg_seq.nextval, 'user2', 'user1', 'user2의 답장2', '잘지내시나요?', sysdate, 2);
insert into msg values(msg_seq.nextval, 'user2', 'user1', 'user2의 답장3', '만나서 반가웠어요~', sysdate, 1);
insert into msg values(msg_seq.nextval, 'user2', 'user1', 'user2의 답장4', '뭐하냐고', sysdate, 2);
insert into msg values(msg_seq.nextval, 'user2', 'user1', 'user2의 답장5', '보면 답장~', sysdate, 1);

-- Table Name: 탈퇴사유
insert into out values(out_SEQ.NEXTVAL, 'vora07', '개인정보 변경으로 인한 재가입', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '자주 이용하지 않음', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '개인정보 변경으로 인한 재가입', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '자주 이용하지 않음', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '개인정보 변경으로 인한 재가입', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '개인정보/사생활 침해 사례 경험', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '개인정보 변경으로 인한 재가입', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '자주 이용하지 않음', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '개인정보 변경으로 인한 재가입', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '찾고자 하는 정보가 없음', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '찾고자 하는 정보가 없음', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '타 사이트의 유사서비스 이용', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '속도가 느림', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '속도가 느림', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '타 사이트의 유사서비스 이용', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '찾고자 하는 정보가 없음', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '기타', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '타 사이트의 유사서비스 이용', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '기타', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '찾고자 하는 정보가 없음', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '찾고자 하는 정보가 없음', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '기타', sysdate);
insert into out values(out_SEQ.NEXTVAL, 'vora07', '기타', sysdate);

commit;

