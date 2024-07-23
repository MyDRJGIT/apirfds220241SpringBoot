package com.codideep.app.business.person.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SoInsert {
	private String firstName;
	private String surName;
	private String dni;
	private boolean gender;
	private String birthDate;
}