package com.example.demo.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Logger {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	public Integer loggerid;
	@Column(name="customerid")
	public String customerid;
	@Column(name="userid")
	public Integer userid;
	@Column(name="employeeid")
	public Integer employeeid;
	@Column(name="screename")
	public String screename;
	@Column(name="action")
	public String action;
	@Column(name="ipaddress")
	public String ipaddress;
	@ManyToOne(cascade=CascadeType.ALL)
	private  CustomerUser cu_action;
	@ManyToOne(cascade=CascadeType.ALL)
	private Customer c_action;
	@ManyToOne(cascade=CascadeType.ALL)
	private  Employee e_action;
	public Integer getLoggerid() {
		return loggerid;
	}
	public void setLoggerid(Integer loggerid) {
		this.loggerid = loggerid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	public String getScreename() {
		return screename;
	}
	public void setScreename(String screename) {
		this.screename = screename;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	public CustomerUser getCu_action() {
		return cu_action;
	}
	public void setCu_action(CustomerUser cu_action) {
		this.cu_action = cu_action;
	}
	public Customer getC_action() {
		return c_action;
	}
	public void setC_action(Customer c_action) {
		this.c_action = c_action;
	}
	public Employee getE_action() {
		return e_action;
	}
	public void setE_action(Employee e_action) {
		this.e_action = e_action;
	}
	@Override
	public int hashCode() {
		return Objects.hash(action, c_action, cu_action, customerid, e_action, employeeid, ipaddress, loggerid,
				screename, userid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Logger other = (Logger) obj;
		return Objects.equals(action, other.action) && Objects.equals(c_action, other.c_action)
				&& Objects.equals(cu_action, other.cu_action) && Objects.equals(customerid, other.customerid)
				&& Objects.equals(e_action, other.e_action) && Objects.equals(employeeid, other.employeeid)
				&& Objects.equals(ipaddress, other.ipaddress) && Objects.equals(loggerid, other.loggerid)
				&& Objects.equals(screename, other.screename) && Objects.equals(userid, other.userid);
	}
	@Override
	public String toString() {
		return "Logger [loggerid=" + loggerid + ", customerid=" + customerid + ", userid=" + userid + ", employeeid="
				+ employeeid + ", screename=" + screename + ", action=" + action + ", ipaddress=" + ipaddress
				+ ", cu_action=" + cu_action + ", c_action=" + c_action + ", e_action=" + e_action + "]";
	}
	

}
