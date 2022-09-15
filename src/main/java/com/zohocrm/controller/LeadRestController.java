package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zohocrm.entity.Lead;
import com.zohocrm.services.LeadService;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {
	
	
	
	@Autowired
	LeadService leadService;
	
	
	@GetMapping
	public ResponseEntity<List<Lead>> listAllLeads(){
		List<Lead> lead = leadService.showLead();	
		return new ResponseEntity<List<Lead>> (lead,HttpStatus.FOUND);	
	}
	
	@PostMapping
	public ResponseEntity<Lead> saveOneLead(@RequestBody Lead lead) {
		
		Lead leads = leadService.saveOneLead(lead);
		return new ResponseEntity<Lead>(leads,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Lead> deleteOneLead(@PathVariable("id") long id) {
		leadService.deleteOneLead(id);
		return new ResponseEntity<Lead>(HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Lead> updateOneLead(@RequestBody Lead lead) {
		Lead lead1 =leadService.saveOneLead(lead);
		return new ResponseEntity<Lead>(lead1,HttpStatus.OK);
	}
	
	@GetMapping("/lead/{id}")
	public ResponseEntity<Lead>  getOneLead(@PathVariable("id") long id) {
		Lead lead1 = leadService.getOneLead(id);
		return new ResponseEntity<Lead>(lead1,HttpStatus.OK);
	}
	
	
	
	
	

}
