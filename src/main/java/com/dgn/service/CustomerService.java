package com.dgn.service;

import com.dgn.domain.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();
     void saveCustomer(Customer theCustomer);

}
