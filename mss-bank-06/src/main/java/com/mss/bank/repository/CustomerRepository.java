package com.mss.bank.repository;

import com.mss.bank.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByEmail(String email);

//    Customer findByEmail(String email);

}
