package com.simulation.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simulation.admin.model.TUser;


public interface TUserDao extends JpaRepository<TUser, Integer>{
	
}
