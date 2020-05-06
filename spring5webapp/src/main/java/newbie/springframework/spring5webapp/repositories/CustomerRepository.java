package newbie.springframework.spring5webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import newbie.springframework.spring5webapp.domain.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long>{

}
