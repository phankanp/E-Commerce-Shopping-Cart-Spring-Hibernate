package com.acme.ecommerce.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Pattern;

@Component
@Scope("session")
public class CouponCode {

    @Pattern(regexp="(^$|.{5,10})", message = "Please enter a valid code between 5 and 10 characters")
	private String code;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
