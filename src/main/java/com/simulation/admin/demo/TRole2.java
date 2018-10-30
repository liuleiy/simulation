package com.simulation.admin.demo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_role")
//@Data
//@ToString(exclude = {"set"})
public class TRole2 {
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
//	private String id;
	private String memo;
	private String r_name;
	private Date ctime;
	private Date update_time;

	@OneToMany(mappedBy = "role",cascade=CascadeType.ALL,fetch=FetchType.LAZY)//fetch=FetchType.LAZY
    /*@OneToMany(
        mappedBy = "role",
        cascade = {CascadeType.PERSIST},
        targetEntity = com.simulation.admin.model.TUser.class,
        fetch = FetchType.EAGER
    )*/
	private Set<TUser2> set = new HashSet<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getR_name() {
		return r_name;
	}

	public void setR_name(String r_name) {
		this.r_name = r_name;
	}

	public Date getCtime() {
		return ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public Set<TUser2> getSet() {
		return set;
	}

	public void setSet(Set<TUser2> set) {
		this.set = set;
	}

	public TRole2(Integer id, String memo, String r_name, Date ctime, Date update_time, Set<TUser2> set) {
		super();
		this.id = id;
		this.memo = memo;
		this.r_name = r_name;
		this.ctime = ctime;
		this.update_time = update_time;
		this.set = set;
	}

	public TRole2() {
		super();
	}

	@Override
	public String toString() {
		return "TRole [id=" + id + ", memo=" + memo + ", r_name=" + r_name + ", ctime=" + ctime + ", update_time="
				+ update_time + ", set=" + set + "]";
	}

	
}
