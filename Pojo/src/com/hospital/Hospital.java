package com.hospital;

public class Hospital {
String hos_Name;
int totalStaff;
public Hospital() {
	
	this.hos_Name = hos_Name;
	this.totalStaff = totalStaff;
}
@Override
public String toString() {
	return "Hospital [hos_Name=" + hos_Name + ", totalStaff=" + totalStaff + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public String getHos_Name() {
	return hos_Name;
}
public void setHos_Name(String hos_Name) {
	this.hos_Name = hos_Name;
}
public int getTotalStaff() {
	return totalStaff;
}
public void setTotalStaff(int totalStaff) {
	this.totalStaff = totalStaff;
}

}
