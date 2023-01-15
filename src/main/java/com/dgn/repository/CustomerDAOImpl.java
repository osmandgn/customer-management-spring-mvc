package com.dgn.repository;

import com.dgn.domain.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    SessionFactory sessionFactory;


    @Override
    @Transactional
    public List<Customer> getCustomers() {
        Session session = sessionFactory.openSession();
        return session.createQuery("From Customer", Customer.class).getResultList();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.save(customer);
    }


}
