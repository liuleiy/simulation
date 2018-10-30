package com.simulation.admin.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simulation.admin.model.TRole;
import com.simulation.admin.model.TUser;
import com.simulation.admin.service.impl.TUserServiceImpl;

@RestController
@RequestMapping("/tuser")
public class TUserController {
	@Autowired
	private TUserServiceImpl tUserServiceImpl;
	
	@GetMapping("/findAll")
	public ModelMap findAll() {
		ModelMap modelMap= new ModelMap();
		List<TUser> findAll = tUserServiceImpl.findAll();
		for (TUser tUser : findAll) {
			System.out.println("tuser:"+tUser);
		}
		modelMap.put("key", findAll);
		return modelMap;
	}
	
	@GetMapping("/add")
	public ModelMap add() {
		ModelMap modelMap= new ModelMap();
		TUser tUser = new TUser();
		tUser.setCreate_time(new Date());
		tUser.setEmail("1655@qa.com");
		tUser.setId(1);
		tUser.setLast_login(new Date());
		tUser.setPassword("123456");
		tUser.setPhone("www");
		tUser.setPhoto("www.as");
		tUser.setSex(0);
		tUser.setStatus(0);
		tUser.setUpdate_time(new Date());
		tUser.setUsername("nichen");
		
		TRole role = new TRole();
		role.setCtime(new Date());
		role.setId(2);
		role.setMemo("注解");
		role.setR_name("管理员");
		role.setUpdate_time(new Date());
		
		role.getSet().add(tUser);
		tUser.setRole(role);
		tUserServiceImpl.save(tUser);
//		tuserDao.save(tUser);
		modelMap.put("key", "add");
		return modelMap;
	}
}
