package com.L3_1team.health.interfac;

import java.util.HashMap;

import com.L3_1team.health.dto.client.menu.Community_border_free_Dto;

public interface free_trans_inter {
	int delete(HashMap<String, String> map);

	int insert(Community_border_free_Dto dto);
}
