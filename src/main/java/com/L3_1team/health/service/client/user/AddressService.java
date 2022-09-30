package com.L3_1team.health.service.client.user;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.L3_1team.health.dao.user.AddressDao;
import com.L3_1team.health.dto.client.user.AddressDto;

@Service
public class AddressService {
	@Inject
	private AddressDao addressDao;

	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}

	public List<AddressDto> getlist(String addrname) {
		return addressDao.getlist(addrname);
	}

}
