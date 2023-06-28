package com.rentcars.service.customer;


import com.rentcars.model.customer.Customer;
import com.rentcars.model.customer.dto.CreateCustomer;
import com.rentcars.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public CreateCustomer register(CreateCustomer dto) {
       Customer entity = this.customerRepository.save(new Customer(dto));
       return new CreateCustomer(entity);
    }
}
