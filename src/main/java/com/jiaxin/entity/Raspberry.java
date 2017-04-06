package com.jiaxin.entity;
import javax.persistence.*; 
@Entity  
@Table(name = "raspberry") 
public class Raspberry {
@Id  
@GeneratedValue(strategy = GenerationType.AUTO)  
private int id;  
private String device_name;
private int device_id;
private String parameter;
private String unit;
private int value;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDevice_name() {
	return device_name;
}
public void setDevice_name(String device_name) {
	this.device_name = device_name;
}
public int getDevice_id() {
	return device_id;
}
public void setDevice_id(int device_id) {
	this.device_id = device_id;
}
public String getParameter() {
	return parameter;
}
public void setParameter(String parameter) {
	this.parameter = parameter;
}
public String getUnit() {
	return unit;
}
public void setUnit(String unit) {
	this.unit = unit;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
}
