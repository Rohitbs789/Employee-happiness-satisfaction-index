package com.happinessindex.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="EmployeeHappinessIndex")
public class EmployeeEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long EmployeeId;
private String Agree;
private String SatisfactionRate;
private String Week;
private String Refer;
private String Happy;
private String FeedBack;
public Long getEmployeeId() {
	return EmployeeId;
}
public void setEmployeeId(Long employeeId) {
	EmployeeId = employeeId;
}
public String getAgree() {
	return Agree;
}
public void setAgree(String agree) {
	Agree = agree;
}
public String getSatisfactionRate() {
	return SatisfactionRate;
}
public void setSatisfactionRate(String satisfactionRate) {
	SatisfactionRate = satisfactionRate;
}
public String getWeek() {
	return Week;
}
public void setWeek(String week) {
	Week = week;
}
public String getRefer() {
	return Refer;
}
public void setRefer(String refer) {
	Refer = refer;
}
public String getHappy() {
	return Happy;
}
public void setHappy(String happy) {
	Happy = happy;
}
public String getFeedBack() {
	return FeedBack;
}
public void setFeedBack(String feedBack) {
	FeedBack = feedBack;
}

}
