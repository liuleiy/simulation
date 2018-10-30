package com.simulation.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulation.admin.dao.TUserDao;
import com.simulation.admin.model.TUser;
import com.simulation.admin.service.TUserService;

@Service
public class TUserServiceImpl implements TUserService{
	
	@Autowired
	private TUserDao tuserDao;

	@Override
	public List<TUser> findAll() {
		return tuserDao.findAll();
	}

	@Override
	public void save(TUser tUser) {
		tuserDao.save(tUser);
	}

	

}
