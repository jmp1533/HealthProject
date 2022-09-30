package com.L3_1team.health.dao.client.menu;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.L3_1team.health.dto.client.menu.Finder_company_Dto;
import com.L3_1team.health.dto.client.user.Mypage_outDto;
import com.L3_1team.health.dto.client.user.TrainerDto;

@Repository
public class Mypage_trainer_Dao {
	@Inject
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public TrainerDto search(HashMap<String, String> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.mypage_trainerMapper.search", map);
	}

	public int update(TrainerDto trainerDto) {
		return sqlSession.update("com.L3_1team.health.mybatis.menu.mypage_trainerMapper.update", trainerDto);
	}

	public int search1(HashMap<String, String> map) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.mypage_trainerMapper.search1", map);
	}

	public int out(String t_id) {
		return sqlSession.update("com.L3_1team.health.mybatis.menu.mypage_trainerMapper.out", t_id);
	}

	public int outreason(Mypage_outDto outDto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.mypage_trainerMapper.outreason", outDto);
	}

	public TrainerDto getinfo(String t_id) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.mypage_trainerMapper.getinfo", t_id);
	}

	public Finder_company_Dto rs(String t_id) {
		return sqlSession.selectOne("com.L3_1team.health.mybatis.menu.mypage_trainerMapper.rs", t_id);
	}

	public int ri(Finder_company_Dto company_Dto) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.mypage_trainerMapper.ri", company_Dto);
	}

	public int ru(Finder_company_Dto company_Dto) {
		return sqlSession.update("com.L3_1team.health.mybatis.menu.mypage_trainerMapper.ru", company_Dto);
	}

	public int bi(HashMap<String, Object> map) {
		return sqlSession.insert("com.L3_1team.health.mybatis.menu.mypage_trainerMapper.bi", map);
	}

	public List<String> bs(int b_num) {
		return sqlSession.selectList("com.L3_1team.health.mybatis.menu.mypage_trainerMapper.bs", b_num);
	}

	public int bd(HashMap<String, Object> map) {
		return sqlSession.delete("com.L3_1team.health.mybatis.menu.mypage_trainerMapper.bd", map);
	}
}
