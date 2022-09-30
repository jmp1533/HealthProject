package com.L3_1team.health.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.L3_1team.health.dto.client.user.UserValDto;

public class UserSignupValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
		return UserValDto.class.isAssignableFrom(cls);
	}

	@Override
	public void validate(Object target, Errors errors) {
		UserValDto uservalDto = (UserValDto) target;
		
		if (uservalDto.getId1().equals("") || uservalDto.getId1().length() < 1) {
			errors.rejectValue("id1", "required", "���̵� �Է��ϼ���");
		}
		if (uservalDto.getPwd1().equals("") || uservalDto.getPwd1().length() < 1) {
			errors.rejectValue("pwd1", "invalid", "��й�ȣ�� �Է��ϼ���.");
		}
		if (!uservalDto.getPwd2().equals(uservalDto.getPwd1())) {
			errors.rejectValue("pwd2", "invalid", "��й�ȣ�� �ٸ��ϴ�.");
		}
		if (uservalDto.getAnswer1().equals("") || uservalDto.getAnswer1().length() < 1) {
			errors.rejectValue("answer1", "invalid", "�亯�� �Է��ϼ���.");
		}
		if (uservalDto.getName1().equals("") || uservalDto.getName1().length() < 1) {
			errors.rejectValue("name1", "invalid", "�̸��� �Է��ϼ���.");
		}
		if (uservalDto.getBirth1().equals("") || uservalDto.getBirth1().length() < 1) {
			errors.rejectValue("birth1", "invalid", "��������� �Է��ϼ���.");
		}
		if (uservalDto.getAddr1().equals("") || uservalDto.getAddr1().length() < 1) {
			errors.rejectValue("addr1", "invalid", "�ּҸ� �Է��ϼ���.");
		}

		if (uservalDto.getBirth1().length() == 8) {
			int year = Integer.parseInt(uservalDto.getBirth1().substring(0, 4));
			int month = Integer.parseInt(uservalDto.getBirth1().substring(4, 6));
			int day = Integer.parseInt(uservalDto.getBirth1().substring(6, 8));

			if (!(1900 <= year && year <= 2013) || !(1 <= month && month <= 12) || !(1 <= day && day <= 31)) {
				errors.rejectValue("birth1", "invalid", "��������� �ٽ��Է��ϼ���.");
			}
		} else {
			errors.rejectValue("birth1", "invalid", "��������� �ٽ��Է��ϼ���.");
		}
	}
}