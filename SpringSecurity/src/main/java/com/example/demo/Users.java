package com.example.demo;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="phone")
	private Long phone;
	@Column(name="cust_id")
	private Long cust_id;
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", phone=" + phone + ", cust_id=" + cust_id + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cust_id, id, name, phone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(cust_id, other.cust_id) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
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
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public Long getCust_id() {
		return cust_id;
	}
	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}

	
}
