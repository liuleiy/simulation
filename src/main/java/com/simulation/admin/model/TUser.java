package com.simulation.admin.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import lombok.Data;
import lombok.ToString;


/**
 * @author Administrator
 *
 */
@Entity
@Table(name = "t_user")
@Data
@ToString(exclude = {"role"})
public class TUser {
	@Id
	private Integer id;
	private String username;
	private String password;
	private String email;
	private Integer sex;//性别,0.1.2(男,女,未知)
	private Date last_login;
	private Date create_time;//创建时间
	private Date update_time;//修改时间
	private String phone;//电话
	private String photo;//图片地址
	private Integer status;//状态,0正常，1禁止
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "t_role")
	@NotFound(action= NotFoundAction.IGNORE)
	private TRole role;

	
	
}
