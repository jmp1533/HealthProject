package com.L3_1team.health.service.client.user;

import java.util.HashMap;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.user.AccountFinderDao;
import com.L3_1team.health.dto.client.user.TrainerDto;
import com.L3_1team.health.dto.client.user.UserDto;

@Service
public class AccountFinderService {
	@Inject 
	private AccountFinderDao accountFinderDao;

	// ���̵� ã��
	public String getUserId(HashMap<String, String> map) {
		return accountFinderDao.getUserId(map);
	}

	public String getTrainerId(HashMap<String, String> map) {
		return accountFinderDao.getTrainerId(map);
	}

	// ��ȸ
	public String getUserInfo(HashMap<String, Object> map) {
		return accountFinderDao.getUserInfo(map);
	}

	public String getTrainerInfo(HashMap<String, Object> map) {
		return accountFinderDao.getTrainerInfo(map);
	}

	// ��й�ȣ �ٲٱ�
	public int userChangePwd(HashMap<String, Object> map) {
		return accountFinderDao.userChangePwd(map);
	}

	public int TraineruserChangePwd(HashMap<String, Object> map) {
		return accountFinderDao.TraineruserChangePwd(map);
	}

	public UserDto getUser(HashMap<String, Object> map) {
		return accountFinderDao.getUser(map);
	}

	public TrainerDto getTrainer(HashMap<String, Object> map) {
		return accountFinderDao.getTrainer(map);
	}
}