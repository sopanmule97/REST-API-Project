package com.project.Hospital.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
	@Id
	int mNo;
	String name;
	String email;
	String dept;
	String bloodG;
	public String getBloodG() {
		return bloodG;
	}
	public void setBloodG(String bloodG) {
		this.bloodG = bloodG;
	}
	@Override
	public String toString() {
		return "Doctor [mNo=" + mNo + ", name=" + name + ", email=" + email + ", dept=" + dept + "]";
	}
	public int getmNo() {
		return mNo;
	}
	public void setmNo(int mNo) {
		this.mNo = mNo;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}
