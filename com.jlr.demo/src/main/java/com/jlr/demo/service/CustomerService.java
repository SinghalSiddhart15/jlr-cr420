package com.jlr.demo.service;

import com.jlr.demo.domain.Customers;
import com.jlr.demo.service.bean.CustomerBean;

import java.util.List;

public interface CustomerService {
    List<Customers> getAllCustomers();

    CustomerBean getById();

    CustomerBean getByName();

    CustomerBean addCustomer(CustomerBean customerBean);

    void deleteCustomer();
}
