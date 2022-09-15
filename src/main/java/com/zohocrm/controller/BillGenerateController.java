package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Billing;
import com.zohocrm.entity.Contact;
import com.zohocrm.services.BillingService;
import com.zohocrm.services.ContactService;

@Controller
public class BillGenerateController {
	
	@Autowired
	BillingService billingService;
	
	@Autowired
	ContactService contactService;

	@RequestMapping("/billingDetails")
	public String billDetails(@RequestParam("id") long id,ModelMap model) {
		Contact contact = contactService.getOneConatct(id);
		model.addAttribute("contact", contact);
		return "bill_generate";
	}
	
	@RequestMapping("/generateBill")
	public String billGenerate(@ModelAttribute("bill") Billing bill,@RequestParam("id") long id,ModelMap model) {
		billingService.saveBillingDetails(bill);
		Billing billing = billingService.getOneBilling(id);
		model.addAttribute("bill", billing);
		return "billing_info";
	}
}
