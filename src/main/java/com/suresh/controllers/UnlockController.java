package com.suresh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.bindings.UnlockAccount;
import com.suresh.service.UnlockService;

@RestController
public class UnlockController {

	@Autowired
	private UnlockService unlockService;

	@PutMapping("/save")
	public String updateTempPassword(@RequestBody UnlockAccount account) {

		String savePassword = unlockService.savePassword(account);
		if (savePassword != null) {
			return "User Password is updated and Accout is unlocked";
		}
		return "unable to update the password in db and Accout is in locked state ";
	}
}
