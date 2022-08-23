package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Customer")
public class Customer {
	@Id
	//@GeneratedValue(strategy =GenerationType.AUTO)
	public String customerid;
	@Column(name="accountholdername")
	public String accountholdername;
	@Column(name="overdraftflag")
	public boolean overdraftflag;
	@Column(name="clearbalance")
	public String clearbalance;
	@Column(name="customeraddress")
	public String customeraddress;
	@Column(name="customercity")
	public String customercity;
	@Column(name="customertype")
	public String customertype;
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Transaction> t_action;
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Logger> l_action;
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<CustomerUser> c_action;
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public boolean isOverdraftflag() {
		return overdraftflag;
	}
	public void setOverdraftflag(boolean overdraftflag) {
		this.overdraftflag = overdraftflag;
	}
	public String getClearbalance() {
		return clearbalance;
	}
	public void setClearbalance(String clearbalance) {
		this.clearbalance = clearbalance;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	public String getCustomercity() {
		return customercity;
	}
	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}
	public String getCustomertype() {
		return customertype;
	}
	public void setCustomertype(String customertype) {
		this.customertype = customertype;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountholdername, clearbalance, customeraddress, customercity, customerid, customertype,
				overdraftflag);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(accountholdername, other.accountholdername)
				&& Objects.equals(clearbalance, other.clearbalance)
				&& Objects.equals(customeraddress, other.customeraddress)
				&& Objects.equals(customercity, other.customercity) && Objects.equals(customerid, other.customerid)
				&& Objects.equals(customertype, other.customertype) && overdraftflag == other.overdraftflag;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", accountholdername=" + accountholdername + ", overdraftflag="
				+ overdraftflag + ", clearbalance=" + clearbalance + ", customeraddress=" + customeraddress
				+ ", customercity=" + customercity + ", customertype=" + customertype + "]";
	}
	
	
}
