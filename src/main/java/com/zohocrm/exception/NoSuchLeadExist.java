package com.zohocrm.exception;

public class NoSuchLeadExist extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public NoSuchLeadExist() {
		
	}

	public NoSuchLeadExist(String msg) {
		super();
		this.setMessage(msg);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
