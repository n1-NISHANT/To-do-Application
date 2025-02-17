package com.example.demo.user;

public class UserTask {
	
		private String taskName;
		private String date;
		private String time;
		
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
			return "UserTask [taskName=" + taskName + ", date=" + date + ", time=" + time + "]";
		}
}
