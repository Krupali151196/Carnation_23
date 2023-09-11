package com.carnation.model;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
//	private String type;
	private String address;
	private Date date;
//	private Date time;
	private String discription;
	private Boolean isComplete;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//public Date getDate() {
	//	return date;
	//}
	//public void setDate(Date date) {
		//this.date = date;
	//}
	//public Date getTime() {
		//return time;
	//}
	//public void setTime(Date time) {
		//this.time = time;
	//}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	//public Boolean getIsComplete() {
		//return isComplete;
	//}
	//public void setIsComplete(Boolean isComplete) {
		//this.isComplete = isComplete;
	///}
	
	
	public Todo() {}
	public Todo(Long id, String name, String address, Date date, Date time, String discription, Boolean isComplete) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.date = date;
//		this.time = time;
		this.discription = discription;
		this.isComplete = isComplete;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
//	public Date getTime() {
//		return time;
//	}
//	public void setTime(Date time) {
//		this.time = time;
//	}
	public Boolean getIsComplete() {
		return isComplete;
	}
	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	

	
	
}
