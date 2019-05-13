package org.caps.dev.feeback.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="employee_master")
public class Employee implements Serializable {

	@Id
	@Column(name="Employee_ID")
	private int employee_ID;
	
	@Column(name="EmployeeName")
	private String employeeName;
	
	@Column(name="Password")
	private String password;

	@Column(name="Role")
	private String role;

	public int getEmployee_ID() {
		return employee_ID;
	}

	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [employee_ID=" + employee_ID + ", employeeName=" + employeeName + ", password=" + password
				+ ", role=" + role + "]";
	}
	
	
	
	
}
