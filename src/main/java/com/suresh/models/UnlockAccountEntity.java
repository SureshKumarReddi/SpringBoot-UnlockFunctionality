package com.suresh.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_dtls")
public class UnlockAccountEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer userId;

	private String temporaryPassword;

	@Column(name = "user_pwd")
	private String chooseNewPassword;

	private String confirmPassword;

	@Column(name = "USER_ACC_STATUS")
	private String userAccountStatus;

	@Column(name = "CREATED_DATE")
	private LocalDate createdDate;

	@Column(name = "UPDATED_DATE")
	private LocalDate updatedDate;
	
	@Column(name = "USER_EMAIL")
	private String userEmail;	
}
