package com.L3_1team.health.service.client.popup;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.client.popup.foodpopup_Dao;
import com.L3_1team.health.dto.client.popup.food_popup_Dto;

@Service
public class foodpopup_Service {
	@Inject
	private foodpopup_Dao dao;

	public foodpopup_Dao getDao() {
		return dao;
	}

	public void setDao(foodpopup_Dao dao) {
		this.dao = dao;
	}

	public List<food_popup_Dto> find_list(String food_name) {
		return dao.find_list(food_name);

	}

}
