package com.simulation.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simulation.admin.model.TRole;
import com.simulation.admin.service.TRoleService;
@Service
public class TRoleImpl implements TRoleService{

	@Autowired
	private TRoleService tRoleService;
	
	@Override
	public List<TRole> findAll() {
		return tRoleService.findAll();
	}

	@Override
	public void save(TRole tRole) {
		tRoleService.save(tRole);
	}

}
