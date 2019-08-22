package com.covalense.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covalense.lms.dto.UserBean;

public interface UserRepository extends JpaRepository<UserBean, Integer> {

	public UserBean findByName(String name);

	public Boolean existsByName(String name);

}
