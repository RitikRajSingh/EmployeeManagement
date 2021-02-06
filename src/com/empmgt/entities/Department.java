package com.empmgt.entities;

public class Department {
	private String deptId;
	private String deptName;
	
	public Department(String deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptId() {
		return deptId;
	}
	
	void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptName() {
		return deptName;
	}
}
