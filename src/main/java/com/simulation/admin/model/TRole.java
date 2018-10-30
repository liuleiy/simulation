package com.simulation.admin.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "t_role")
@Data
@ToString(exclude = {"set"})
public class TRole {
	@Id
	private Integer id;
	private String memo;
	private String r_name;
	private Date ctime;
	private Date update_time;

    @OneToMany(
        mappedBy = "role",
        cascade = {CascadeType.PERSIST},
        targetEntity = com.simulation.admin.model.TUser.class,
        fetch = FetchType.EAGER
    )
	private Set<TUser> set = new HashSet<>();

	
	
}
