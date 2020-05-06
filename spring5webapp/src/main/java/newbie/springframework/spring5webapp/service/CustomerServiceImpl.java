package newbie.springframework.spring5webapp.service;

import java.util.List;

import newbie.springframework.spring5webapp.domain.Customer;
import newbie.springframework.spring5webapp.repositories.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private final CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	@Override
	public Customer findCustomerById(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.getOne(id);
	}

	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

}
