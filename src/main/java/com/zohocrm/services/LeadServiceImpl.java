package com.zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Lead;
import com.zohocrm.exception.InvalidEntry;
import com.zohocrm.exception.LeadAlreadyExist;
import com.zohocrm.exception.NoSuchLeadExist;
import com.zohocrm.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	LeadRepository leadRepo;
	
	@Override
	public Lead saveOneLead(Lead lead) {
		Lead existingLead = leadRepo.findById(lead.getId()).orElse(null);
		if (lead.getFirstName().isEmpty()|| lead.getLastName().isEmpty()||lead.getEmail().isEmpty()) {
			  throw new InvalidEntry("601","input field are empty");
		}  
			if (existingLead==null) {
				leadRepo.save(lead);
				return null;
				
			}  else {
				  throw new LeadAlreadyExist("Lead already exist");
			}
		
	}

	@Override
	public List<Lead> showLead() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public Lead getOneLead(long id) {
		Lead existingLead = leadRepo.findById(id).orElse(null);
		if (existingLead==null) {
			throw new NoSuchLeadExist("No such Lead Exists");
		}else {
		return existingLead;
		}
	}
	

	@Override
	public Lead deleteOneLead(long id) {
		Lead existingLead = leadRepo.findById(id).orElse(null);
		if (existingLead==null) {
			throw new NoSuchLeadExist("No such Lead Exists");
		}else {
			leadRepo.deleteById(id);
		return null;
		}
		
	}

}
