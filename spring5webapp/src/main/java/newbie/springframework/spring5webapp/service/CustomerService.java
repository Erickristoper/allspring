package newbie.springframework.spring5webapp.service;

import java.util.List;

import newbie.springframework.spring5webapp.domain.Customer;

public interface CustomerService {

	Customer findCustomerById(Long id);
	List<Customer> findAllCustomers();
}
