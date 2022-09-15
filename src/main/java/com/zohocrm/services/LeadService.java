package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entity.Lead;

public interface LeadService {

	public Lead saveOneLead(Lead lead);

	public List<Lead> showLead();

	public Lead getOneLead(long id);

	public Lead deleteOneLead(long id);


}
