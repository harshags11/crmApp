package com.zohocrm.services;

import com.zohocrm.entity.Billing;

public interface BillingService {

	public void saveBillingDetails(Billing bill);

	public Billing getOneBilling(long id);

}
