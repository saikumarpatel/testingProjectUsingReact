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
@Table(name="Transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	public Integer transactionid;
	@Column(name="customerid")
	public String customerid;
	@Column(name="currencycode")
	public String currencycode;
	@Column(name="senderBIC")
	public String senderBIC;
	@Column(name="transferdata")
	public String transferdata;
	@Column(name="receiverBIC")
	public String receiverBIC;
	@Column(name="receiveraccountholdernumber")
	public String receiveraccountholdernumber;
	@Column(name="receiveraccountholdername")
	public String receiveraccountholdername;
	@Column(name="transfertypecode")
	public String transfertypecode;
	@Column(name="messasgecode")
	public String messagecode;
	@Column(name="cuurencyamount")
	public Long currencyamount;
	@Column(name="transferfees")
	public Long transferfees;
	@Column(name="inramount")
	public Long inramount;
	@ManyToOne(cascade=CascadeType.ALL)
	private  Customer c_action;
	@ManyToOne(cascade=CascadeType.ALL)
	private  Currency cu_action;
	@ManyToOne(cascade=CascadeType.ALL)
	private  Bank b_action;
	@ManyToOne(cascade=CascadeType.ALL)
	private  Transfertypes t_action;
	@ManyToOne(cascade=CascadeType.ALL)
	private  Message m_action;
	public Integer getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(Integer transactionid) {
		this.transactionid = transactionid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCurrencycode() {
		return currencycode;
	}
	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}
	public String getSenderBIC() {
		return senderBIC;
	}
	public void setSenderBIC(String senderBIC) {
		this.senderBIC = senderBIC;
	}
	public String getTransferdata() {
		return transferdata;
	}
	public void setTransferdata(String transferdata) {
		this.transferdata = transferdata;
	}
	public String getReceiverBIC() {
		return receiverBIC;
	}
	public void setReceiverBIC(String receiverBIC) {
		this.receiverBIC = receiverBIC;
	}
	public String getReceiveraccountholdernumber() {
		return receiveraccountholdernumber;
	}
	public void setReceiveraccountholdernumber(String receiveraccountholdernumber) {
		this.receiveraccountholdernumber = receiveraccountholdernumber;
	}
	public String getReceiveraccountholdername() {
		return receiveraccountholdername;
	}
	public void setReceiveraccountholdername(String receiveraccountholdername) {
		this.receiveraccountholdername = receiveraccountholdername;
	}
	public String getTransfertypecode() {
		return transfertypecode;
	}
	public void setTransfertypecode(String transfertypecode) {
		this.transfertypecode = transfertypecode;
	}
	public String getMessagecode() {
		return messagecode;
	}
	public void setMessagecode(String messagecode) {
		this.messagecode = messagecode;
	}
	public Long getCurrencyamount() {
		return currencyamount;
	}
	public void setCurrencyamount(Long currencyamount) {
		this.currencyamount = currencyamount;
	}
	public Long getTransferfees() {
		return transferfees;
	}
	public void setTransferfees(Long transferfees) {
		this.transferfees = transferfees;
	}
	public Long getInramount() {
		return inramount;
	}
	public void setInramount(Long inramount) {
		this.inramount = inramount;
	}
	public Customer getC_action() {
		return c_action;
	}
	public void setC_action(Customer c_action) {
		this.c_action = c_action;
	}
	public Currency getCu_action() {
		return cu_action;
	}
	public void setCu_action(Currency cu_action) {
		this.cu_action = cu_action;
	}
	public Bank getB_action() {
		return b_action;
	}
	public void setB_action(Bank b_action) {
		this.b_action = b_action;
	}
	public Transfertypes getT_action() {
		return t_action;
	}
	public void setT_action(Transfertypes t_action) {
		this.t_action = t_action;
	}
	public Message getM_action() {
		return m_action;
	}
	public void setM_action(Message m_action) {
		this.m_action = m_action;
	}
	@Override
	public int hashCode() {
		return Objects.hash(b_action, c_action, cu_action, currencyamount, currencycode, customerid, inramount,
				m_action, messagecode, receiverBIC, receiveraccountholdername, receiveraccountholdernumber, senderBIC,
				t_action, transactionid, transferdata, transferfees, transfertypecode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(b_action, other.b_action) && Objects.equals(c_action, other.c_action)
				&& Objects.equals(cu_action, other.cu_action) && Objects.equals(currencyamount, other.currencyamount)
				&& Objects.equals(currencycode, other.currencycode) && Objects.equals(customerid, other.customerid)
				&& Objects.equals(inramount, other.inramount) && Objects.equals(m_action, other.m_action)
				&& Objects.equals(messagecode, other.messagecode) && Objects.equals(receiverBIC, other.receiverBIC)
				&& Objects.equals(receiveraccountholdername, other.receiveraccountholdername)
				&& Objects.equals(receiveraccountholdernumber, other.receiveraccountholdernumber)
				&& Objects.equals(senderBIC, other.senderBIC) && Objects.equals(t_action, other.t_action)
				&& Objects.equals(transactionid, other.transactionid)
				&& Objects.equals(transferdata, other.transferdata) && Objects.equals(transferfees, other.transferfees)
				&& Objects.equals(transfertypecode, other.transfertypecode);
	}
	@Override
	public String toString() {
		return "Transaction [transactionid=" + transactionid + ", customerid=" + customerid + ", currencycode="
				+ currencycode + ", senderBIC=" + senderBIC + ", transferdata=" + transferdata + ", receiverBIC="
				+ receiverBIC + ", receiveraccountholdernumber=" + receiveraccountholdernumber
				+ ", receiveraccountholdername=" + receiveraccountholdername + ", transfertypecode=" + transfertypecode
				+ ", messagecode=" + messagecode + ", currencyamount=" + currencyamount + ", transferfees="
				+ transferfees + ", inramount=" + inramount + ", c_action=" + c_action + ", cu_action=" + cu_action
				+ ", b_action=" + b_action + ", t_action=" + t_action + ", m_action=" + m_action + "]";
	}
	

	
}
