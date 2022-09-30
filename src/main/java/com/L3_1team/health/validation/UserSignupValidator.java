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
			errors.rejectValue("id1", "required", "아이디를 입력하세요");
		}
		if (uservalDto.getPwd1().equals("") || uservalDto.getPwd1().length() < 1) {
			errors.rejectValue("pwd1", "invalid", "비밀번호를 입력하세요.");
		}
		if (!uservalDto.getPwd2().equals(uservalDto.getPwd1())) {
			errors.rejectValue("pwd2", "invalid", "비밀번호가 다릅니다.");
		}
		if (uservalDto.getAnswer1().equals("") || uservalDto.getAnswer1().length() < 1) {
			errors.rejectValue("answer1", "invalid", "답변을 입력하세요.");
		}
		if (uservalDto.getName1().equals("") || uservalDto.getName1().length() < 1) {
			errors.rejectValue("name1", "invalid", "이름을 입력하세요.");
		}
		if (uservalDto.getBirth1().equals("") || uservalDto.getBirth1().length() < 1) {
			errors.rejectValue("birth1", "invalid", "생년월일을 입력하세요.");
		}
		if (uservalDto.getAddr1().equals("") || uservalDto.getAddr1().length() < 1) {
			errors.rejectValue("addr1", "invalid", "주소를 입력하세요.");
		}

		if (uservalDto.getBirth1().length() == 8) {
			int year = Integer.parseInt(uservalDto.getBirth1().substring(0, 4));
			int month = Integer.parseInt(uservalDto.getBirth1().substring(4, 6));
			int day = Integer.parseInt(uservalDto.getBirth1().substring(6, 8));

			if (!(1900 <= year && year <= 2013) || !(1 <= month && month <= 12) || !(1 <= day && day <= 31)) {
				errors.rejectValue("birth1", "invalid", "생년월일을 다시입력하세요.");
			}
		} else {
			errors.rejectValue("birth1", "invalid", "생년월일을 다시입력하세요.");
		}
	}
}