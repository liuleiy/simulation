package com.simulation.admin.service;

import java.util.List;

import com.simulation.admin.model.TUser;


public interface TUserService {
	List<TUser> findAll();
	
	void save(TUser tUser);
}
