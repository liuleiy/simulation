package com.simulation.admin;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.simulation.admin.dao.TRoleDao;
import com.simulation.admin.dao.TUserDao;
import com.simulation.admin.model.TRole;
import com.simulation.admin.model.TUser;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimulationApplicationTests {

	@Autowired
	private TUserDao tuserDao;
	
//	@Autowired
//	private TRoleDao tRoleDao;
	
	@Test
	public void contextLoads() {
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
		role.setId(1);
		role.setMemo("注解");
		role.setR_name("管理员");
		role.setUpdate_time(new Date());
		
		role.getSet().add(tUser);
		tUser.setRole(role);
		tuserDao.save(tUser);
	}
	
	@Test
	public void contextLoads2() {
		List<TUser> findAll = tuserDao.findAll();
		for (TUser tUser : findAll) {
			System.out.println("tUser:"+tUser);
		}
		System.out.println("size:"+findAll.size());
	}

}
