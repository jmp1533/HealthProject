package com.L3_1team.health.service.client.user;

import java.util.HashMap;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.user.TrainerDao;
import com.L3_1team.health.dto.client.user.TrainerDto;

@Service
public class TrainerService {
	@Inject
	private TrainerDao trainerDao;

	public void setTrainerDao(TrainerDao trainerDao) {
		this.trainerDao = trainerDao;
	}

	public int insert(TrainerDto trainerDto) {
		return trainerDao.insert(trainerDto);
	}

	public String login(HashMap<String, String> map) {
		return trainerDao.login(map);
	}

	public int trainerlog(String trainerlogid) {
		return trainerDao.trainerlog(trainerlogid);
	}
}
