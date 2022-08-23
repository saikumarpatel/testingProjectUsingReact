
package com.example.demo;

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
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
@Column(name="firstname")
private String firstname;
@Column(name="lastname")
private String lastname;
@Column(name="phone")
private String phone;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone + "]";
}
@Override
public int hashCode() {
	return Objects.hash(firstname, id, lastname, phone);
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
	return Objects.equals(firstname, other.firstname) && Objects.equals(id, other.id)
			&& Objects.equals(lastname, other.lastname) && Objects.equals(phone, other.phone);
}


}