package com.simulation.admin.service;

import java.util.List;

import com.simulation.admin.model.TRole;

public interface TRoleService {
	List<TRole> findAll();

	void save(TRole tRole);
}
