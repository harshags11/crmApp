package com.zohocrm.exception;

public class LeadAlreadyExist extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public LeadAlreadyExist() {
		
	}

	public LeadAlreadyExist(String msg) {
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
