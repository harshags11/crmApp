package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Contact;
import com.zohocrm.entity.Lead;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadService;
import com.zohocrm.util.EmailService;

@Controller
public class LeadController {
	@Autowired
	EmailService emailService;
	
	@Autowired
	LeadService leadService;
	
	@Autowired
	ContactService contactService;

	@RequestMapping("/")
	public String viewFirstPage() {
		return "lead_page";
	}
	
	
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		
			
		   leadService.saveOneLead(lead);
		   emailService.sendEmail(lead.getEmail(), "test", "testEmail");
		   model.addAttribute("msg", "Lead Saved Successfully!!!!");
			return "lead_page";
	}
	
	@RequestMapping("/showLeads")
	public String showLeads(ModelMap model) {
		List<Lead> lead = leadService.showLead();
		model.addAttribute("lead", lead);
		return "list_leads";
	}
	
	@RequestMapping("/getOneLead")
	public String getOneLead(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.getOneLead(id);
		model.addAttribute("lead", lead);
		return "one_lead";
	}
	
	@RequestMapping("/convertLead")
	public String ConvertLead(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.getOneLead(id);
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contactService.saveContact(contact);
		List<Contact> contacts = contactService.listcontacts();
		model.addAttribute("contact", contacts);
		leadService.deleteOneLead(id);
		return "contact_list";
	}
	
	@RequestMapping("/showContacts")
	public String viewContacts(ModelMap model) {
		List<Contact> contacts = contactService.listcontacts();
		model.addAttribute("contact", contacts);
		return "contact_list";
	}
	
	@RequestMapping("/getOneConatct")
	public String getOneConatct(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.getOneConatct(id);
		model.addAttribute("contact", contact);
		return "contact_info";
	}
	
	@RequestMapping("/search")
	public String search() {
		return "search";
	}
	
	@RequestMapping("/searchById")
	public String searchById(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.getOneConatct(id);
		model.addAttribute("contact", contact);
		return "contact_info";
	}
	
	@RequestMapping("/updateContact")
	public String updateConact(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.getOneConatct(id);
		model.addAttribute("contact", contact);
		return "update_contact";
	}
	
	@RequestMapping("/update")
	public String updateOneContact(@ModelAttribute("contact") Contact contact, ModelMap model) {
		contactService.saveContact(contact);
		List<Contact> contacts = contactService.listcontacts();
		model.addAttribute("contact", contacts);
		return "contact_list";
	}
}
