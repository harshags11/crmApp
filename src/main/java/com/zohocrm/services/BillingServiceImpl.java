package com.zohocrm.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Billing;
import com.zohocrm.repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	BillingRepository billingRepo;

	@Override
	public void saveBillingDetails(Billing bill) {
		billingRepo.save(bill);
		
	}

	@Override
	public Billing getOneBilling(long id) {
		Optional<Billing> findById = billingRepo.findById(id);
		Billing bill = findById.get();
		return bill;
	}
}
