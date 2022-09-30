package com.L3_1team.health.controller.client.user;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.L3_1team.health.dto.client.user.AddressDto;
import com.L3_1team.health.service.client.user.AddressService;

@Controller
public class AddressController {
	@Inject
	private AddressService addressService;

	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	}

	@RequestMapping(value = "/client/user/insert/addr/Address", method = RequestMethod.GET)
	public String addrForm() {
		return ".client.user.insert.addr.Address";
	}

	@RequestMapping(value = "/client/user/insert/addr/Address", method = RequestMethod.POST)
	public String addrSelect(@Param("addrname") String addrname, Model model) {

		if (addrname != null && addrname != "") {
			List<AddressDto> list = addressService.getlist(addrname);
			model.addAttribute("list", list);
		} else {
			model.addAttribute("list", null);
		}

		return ".client.user.insert.addr.Address";
	}

}
