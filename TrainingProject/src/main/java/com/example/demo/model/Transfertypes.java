package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transfertypes")
public class Transfertypes {
	@Id
	//@GeneratedValue(strategy =GenerationType.AUTO)
	public String transfertypecode;
	@Column(name="transfertypedescription")
	public String transfertypedescription;
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Transaction> t_action;
	public String getTransfertypecode() {
		return transfertypecode;
	}
	public void setTransfertypecode(String transfertypecode) {
		this.transfertypecode = transfertypecode;
	}
	public String getTransfertypedesciption() {
		return transfertypedescription;
	}
	public void setTransfertypedesciption(String transfertypedescription) {
		this.transfertypedescription = transfertypedescription;
	}
	@Override
	public int hashCode() {
		return Objects.hash(transfertypecode, transfertypedescription);
		}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transfertypes other = (Transfertypes) obj;
		return Objects.equals(transfertypecode, other.transfertypecode)
				&& Objects.equals(transfertypedescription, other.transfertypedescription);
	}
	@Override
	public String toString() {
		return "Transfertypes [transfertypecode=" + transfertypecode + ", transfertypedescription="
				+ transfertypedescription + "]";
	}
	
	
}
