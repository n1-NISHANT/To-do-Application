package com.example.demo.Entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer uid;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String pwd;
	@Column
	private String gender;
	@Column
	private Long phno;
	
	//---Mapping One to many  ----
	@OneToMany(mappedBy = "uEntity",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<UserTaskEntity> uTask;
	
	public List<UserTaskEntity> getuTask() {
		return uTask;
	}
	public void setuTask(List<UserTaskEntity> uTask) {
		this.uTask = uTask;
	}
	public Integer getUid() {
		return uid;
	}
	
	//---
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "UserEntity [uid=" + uid + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", gender=" + gender
				+ ", phno=" + phno + "]";
	}
	
}
