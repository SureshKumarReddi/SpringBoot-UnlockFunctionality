package com.suresh.bindings;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UnlockAccount {

	private Integer userId;
	private String temporaryPassword;
	private String chooseNewPassword;
	private String confirmPassword;
	private String userAccountStatus;
	private LocalDate createdDate;
	private LocalDate updatedDate;
	private String userEmail;
}
