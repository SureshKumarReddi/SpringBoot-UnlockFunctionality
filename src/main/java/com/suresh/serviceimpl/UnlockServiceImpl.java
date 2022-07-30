package com.suresh.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suresh.bindings.UnlockAccount;
import com.suresh.models.UnlockAccountEntity;
import com.suresh.repository.UnlockAccountEntityRepository;
import com.suresh.service.UnlockService;

@Service
public class UnlockServiceImpl implements UnlockService {

	@Autowired
	private UnlockAccountEntityRepository repository;

	@Override
	public String savePassword(UnlockAccount account) {

		String pass = account.getTemporaryPassword();
		String email = account.getUserEmail();
		boolean findBychooseNewPassword = repository.findByChooseNewPasswordAndUserEmail(pass,email);
		if (findBychooseNewPassword) {
			UnlockAccountEntity entity = new UnlockAccountEntity();
			entity.setTemporaryPassword(account.getChooseNewPassword());
			entity.setUserAccountStatus("Account Unlocked");

			UnlockAccountEntity save = repository.save(entity);
			if (save != null) {
				return "User Password is updated";
			}

		}
		return null;

	}

}
