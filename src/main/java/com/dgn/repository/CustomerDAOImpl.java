package com.dgn.repository;

import com.dgn.domain.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {

        Session session = sessionFactory.openSession();

        return session.createQuery("from Customer order by lastName", Customer.class).getResultList();
    }

    @Override
    public void saveCustomer(Customer theCustomer) {

        Session session = sessionFactory.openSession();

        session.saveOrUpdate(theCustomer);
    }

//    @Override
//    public Customer getCustomer(int theId) {
//
//        Session session = sessionFactory.openSession();
//
//        Customer theCustomer = session.get(Customer.class, theId);
//        return theCustomer;
//    }
//
//    @Override
//    public void deleteCustomer(int theId) {
//
//        Session session = sessionFactory.openSession();
//
//        session.delete(session.get(Customer.class, theId));
//
//    }

}