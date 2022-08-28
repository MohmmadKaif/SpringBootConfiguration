package com.example.SpringTest.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
@Id	
private String rollNo;
private String name;

public String getRollNo() {
	return rollNo;
}
public void setRollNo(String rollNo) {
	this.rollNo = rollNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
