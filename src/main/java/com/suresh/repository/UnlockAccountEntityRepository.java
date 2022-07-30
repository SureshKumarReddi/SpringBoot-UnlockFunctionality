package com.suresh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suresh.models.UnlockAccountEntity;

public interface UnlockAccountEntityRepository extends JpaRepository<UnlockAccountEntity, Integer> {
 
	  public boolean findByChooseNewPasswordAndUserEmail(String password,String email);
}
