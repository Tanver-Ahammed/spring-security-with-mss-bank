package com.mss.bank.repository;

import java.util.List;

import com.mss.bank.model.Loans;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends CrudRepository<Loans, Long> {

//	 @PreAuthorize("hasAnyRole('USER')")
	List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);

}
