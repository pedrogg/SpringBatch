package com.rw.spring.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rw.spring.batch.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
