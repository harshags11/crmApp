package com.zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entity.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
