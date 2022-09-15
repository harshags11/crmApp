package com.zohocrm.controllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.zohocrm.exception.InvalidEntry;
import com.zohocrm.exception.LeadAlreadyExist;
import com.zohocrm.exception.NoSuchLeadExist;

@ControllerAdvice
public class HandleException {
	
	@ExceptionHandler(InvalidEntry.class)
	public ResponseEntity<String> handleEmptyInput(InvalidEntry invalidEntry){
		return new ResponseEntity<String>("input field are empty!!", HttpStatus.BAD_REQUEST);
	}
		
	@ExceptionHandler(LeadAlreadyExist.class)
	public ResponseEntity<String> handleLeadAlreadyExist(LeadAlreadyExist leadAlreadyExist){
		return new ResponseEntity<String>("input already exist!!", HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(NoSuchLeadExist.class)
	public ResponseEntity<String> handleNoSuchLeadExist(NoSuchLeadExist noSuchLeadExist){
		return new ResponseEntity<String>("no lead found!!", HttpStatus.BAD_REQUEST);
		
	}
}
