package com.dgn.controller;

import com.dgn.repository.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;


    @RequestMapping("list")
    public String listCustomers(Model model){
        model.addAttribute("list", customerDAO.getCustomers());
        return "list-customer";
    }
}
