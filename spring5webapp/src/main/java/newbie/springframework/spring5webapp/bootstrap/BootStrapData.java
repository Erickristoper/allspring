package newbie.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import newbie.springframework.spring5webapp.domain.Customer;
import newbie.springframework.spring5webapp.repositories.CustomerRepository;

@Component
public class BootStrapData implements CommandLineRunner {
	
	private final CustomerRepository customerRepository;
	
	public BootStrapData(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public void run(String... args) throws Exception {
		
		System.out.println("Loading customer data...");
		
		Customer customer = new Customer();
		customer.setFirstname("Eric");
		customer.setLastname("Del Socorro");
		customerRepository.save(customer);

		customer = new Customer();
		customer.setFirstname("Mark");
		customer.setLastname("Gonzales");
		customerRepository.save(customer);
		
		customer = new Customer();
		customer.setFirstname("John");
		customer.setLastname("Silvestro");
		customerRepository.save(customer);
		
		System.out.println("Customer saved: " + customerRepository.count());
		
	}
	
}
