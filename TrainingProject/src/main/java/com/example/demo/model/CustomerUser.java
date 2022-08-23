package com.example.demo.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CustomerUser")
public class CustomerUser {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	public Integer userid;
	@Column(name="username")
	public String username;
	@Column(name="customerid")
	public String customerid;
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Logger> l_action;
	@ManyToOne(cascade=CascadeType.ALL)
	private  Customer c_action;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public Customer getC_action() {
		return c_action;
	}
	public void setC_action(Customer c_action) {
		this.c_action = c_action;
	}
	@Override
	public int hashCode() {
		return Objects.hash(c_action, customerid, userid, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerUser other = (CustomerUser) obj;
		return Objects.equals(c_action, other.c_action) && Objects.equals(customerid, other.customerid)
				&& Objects.equals(userid, other.userid) && Objects.equals(username, other.username);
	}
	@Override
	public String toString() {
		return "CustomerUser [userid=" + userid + ", username=" + username + ", customerid=" + customerid
				+ ", c_action=" + c_action + "]";
	}
	
}
