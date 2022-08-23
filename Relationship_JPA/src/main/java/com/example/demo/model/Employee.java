package com.example.demo.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employee_id;
	private String name,phone;
	@OneToOne(cascade=CascadeType.ALL)
	private Bank bankAccount;
	public Long getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Bank getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(Bank bankAccount) {
		this.bankAccount = bankAccount;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bankAccount, employee_id, name, phone);
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
		return Objects.equals(bankAccount, other.bankAccount) && Objects.equals(employee_id, other.employee_id)
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", name=" + name + ", phone=" + phone + ", bankAccount="
				+ bankAccount + "]";
	}
	
	
}
