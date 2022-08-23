package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bank")
public class Bank {
	@Id
//	@GeneratedValue(strategy =GenerationType.AUTO)
	public String bic;
	@Column(name="bankname")
	public String bankname;
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Transaction> t_action;
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bankname, bic);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		return Objects.equals(bankname, other.bankname) && Objects.equals(bic, other.bic);
	}
	@Override
	public String toString() {
		return "Bank [bic=" + bic + ", bankname=" + bankname + "]";
	}
	
	
}