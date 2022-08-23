package com.example.demo;

import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)

public class RecordNotFoundException extends RuntimeException {
private static final long serialVersionUID = 3453335341L;
    @Override
public String toString() {
	return "RecordNotFoundException [message=" + message + "]";
}
	@Override
public int hashCode() {
	return Objects.hash(message);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	RecordNotFoundException other = (RecordNotFoundException) obj;
	return Objects.equals(message, other.message);
}
	public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
	private String message;
    
}