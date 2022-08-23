package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Message")
public class Message {
	@Id
	//@GeneratedValue(strategy =GenerationType.AUTO)
	public String messagecode;
	@Column(name="instruction")
	public String instruction;
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<Transaction> t_action;
	public String getMessagecode() {
		return messagecode;
	}
	public void setMessagecode(String messagecode) {
		this.messagecode = messagecode;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	@Override
	public int hashCode() {
		return Objects.hash(instruction, messagecode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		return Objects.equals(instruction, other.instruction) && Objects.equals(messagecode, other.messagecode);
	}
	@Override
	public String toString() {
		return "Message [messagecode=" + messagecode + ", instruction=" + instruction + "]";
	}
	
}
