package com.dgn.repository;

import com.dgn.domain.Customer;

import java.util.List;

public interface CustomerDAO {

     List<Customer> getCustomers();

     void saveCustomer(Customer customer);

}
