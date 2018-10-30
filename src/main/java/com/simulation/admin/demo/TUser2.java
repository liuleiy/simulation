package com.simulation.admin.demo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * @author Administrator
 *
 */
@Entity
@Table(name = "t_user")
//@Data
//@ToString(exclude = {"role"})
public class TUser2 {
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	
	@ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)//可选属性optional=false,表示author不能为空。删除文章，不影响用户
    @JoinColumn(name="t_role")//设置在article表中的关联字段(外键)
	/*@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "t_role")
	@NotFound(action= NotFoundAction.IGNORE)*/
	private TRole2 role;

	public TUser2(Integer id, String username, String password, String email, Integer sex, Date last_login,
			Date create_time, Date update_time, String phone, String photo, Integer status, TRole2 role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.sex = sex;
		this.last_login = last_login;
		this.create_time = create_time;
		this.update_time = update_time;
		this.phone = phone;
		this.photo = photo;
		this.status = status;
		this.role = role;
	}

	public TUser2() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getLast_login() {
		return last_login;
	}

	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public TRole2 getRole() {
		return role;
	}

	public void setRole(TRole2 role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "TUser [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", sex="
				+ sex + ", last_login=" + last_login + ", create_time=" + create_time + ", update_time=" + update_time
				+ ", phone=" + phone + ", photo=" + photo + ", status=" + status + ", role=" + role + "]";
	}
	
	
	
}
