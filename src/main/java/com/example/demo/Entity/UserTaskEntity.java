package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_task")
public class UserTaskEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer taskId;
	@Column
	private String taskName;
	@Column
	private String date;
	@Column
	private String time;
	
	//------Mapping ---- 
	@ManyToOne
	@JoinColumn(name = "uid")
	private UserEntity uEntity;

	public UserEntity getuEntity() {
		return uEntity;
	}

	public void setuEntity(UserEntity uEntity) {
		this.uEntity = uEntity;
	}
	
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "UserTaskEntity [taskName=" + taskName + ", date=" + date + ", time=" + time + ", uEntity=" + uEntity
				+ "]";
	}
	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
}
