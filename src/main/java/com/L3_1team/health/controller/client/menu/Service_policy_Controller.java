package com.L3_1team.health.controller.client.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Service_policy_Controller {

	@RequestMapping(value = "/client/menu/service/policy/view", method = RequestMethod.GET)
	public String policy() {
		return ".client.menu.service.policy.view";
	}
}
