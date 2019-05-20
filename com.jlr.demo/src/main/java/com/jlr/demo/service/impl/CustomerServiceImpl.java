package com.jlr.demo.service.impl;

import com.jlr.demo.domain.Customers;
import com.jlr.demo.repository.CustomerRepository;
import com.jlr.demo.service.CustomerService;
import com.jlr.demo.service.bean.CustomerBean;
import com.jlr.demo.service.mapper.CustomerBeanMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerBeanMapper customerBeanMapper;

    @Override
    public List<Customers> getAllCustomers() {
        return null;
    }

    @Override
    public CustomerBean getById() {
        return null;
    }

    @Override
    public CustomerBean getByName() {
        return null;
    }

    @Override
    public CustomerBean addCustomer(CustomerBean customerBean) {
         customerRepository.save(customerBeanMapper.fromBean(customerBean));
         return customerBean;
    }

    @Override
    public void deleteCustomer() {

    }
}
