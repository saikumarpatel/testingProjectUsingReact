package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)

	public Integer employeeid;
	@Column(name="employeename")
	public String employeename;
	@Column(name="employeepassword")
	public String employeepassword;
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Logger> l_action;
	public Integer getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeepassword() {
		return employeepassword;
	}
	public void setEmployeepassword(String employeepassword) {
		this.employeepassword = employeepassword;
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeid, employeename, employeepassword);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(employeeid, other.employeeid) && Objects.equals(employeename, other.employeename)
				&& Objects.equals(employeepassword, other.employeepassword);
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeepassword="
				+ employeepassword + "]";
	}
	
}
