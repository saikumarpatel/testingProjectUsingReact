package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Currency {
	@Id
	//@GeneratedValue(strategy =GenerationType.AUTO)
	public String currencycode;
	@Column (name="currencyname")
	public String currencyname;
	@Column (name="concersionrate")
	public long conversionrate;
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Transaction> c_action;
	public String getCurrencycode() {
		return currencycode;
	}
	public void setCurrencycode(String currencycode) {
		this.currencycode = currencycode;
	}
	public String getCurrencyname() {
		return currencyname;
	}
	public void setCurrencyname(String currencyname) {
		this.currencyname = currencyname;
	}
	public long getConversionrate() {
		return conversionrate;
	}
	public void setConversionrate(long conversionrate) {
		this.conversionrate = conversionrate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conversionrate, currencycode, currencyname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currency other = (Currency) obj;
		return conversionrate == other.conversionrate && Objects.equals(currencycode, other.currencycode)
				&& Objects.equals(currencyname, other.currencyname);
	}
	@Override
	public String toString() {
		return "Currency [currencycode=" + currencycode + ", currencyname=" + currencyname + ", conversionrate="
				+ conversionrate + "]";
	}
	
	
}
