package com.simulation.admin.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
public class TUser {
	@Id
	private Integer id;
}
