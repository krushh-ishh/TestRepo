package com.poc.entity;

public class Appointment {
	
	private int id;
	private String userId;
	private String appointmentDate;
	private String appointmentTime;
	private String appointmentWith;
	
	public Appointment() {
		super();
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public String getAppointmentWith() {
		return appointmentWith;
	}
	public void setAppointmentWith(String appointmentWith) {
		this.appointmentWith = appointmentWith;
	}

	
}
