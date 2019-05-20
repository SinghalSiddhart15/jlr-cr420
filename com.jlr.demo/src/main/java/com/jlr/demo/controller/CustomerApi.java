package com.jlr.demo.controller;

import com.jlr.demo.controller.mapper.CustomerWsMapper;
import com.jlr.demo.controller.ws.CustomerWs;
import com.jlr.demo.domain.Customers;
import com.jlr.demo.repository.CustomerRepository;
import com.jlr.demo.service.CustomerService;
import com.jlr.demo.service.bean.CustomerBean;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerApi {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerWsMapper customerWsMapper;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Customers> getAllCustomers() {
//        return customerWsMapper.fromBean(customerService.getAllCustomers());
        return customerRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Customers getById(@PathVariable("id") ObjectId id) {
        return customerRepository.findBy_id(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Customers getByName(@RequestParam(value = "name") String name) {
        return customerRepository.findByFirstName(name);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public CustomerBean addCustomer(@Valid @RequestBody CustomerWs customerWs) {
        customerWs.set_id(ObjectId.get());
        return customerService.addCustomer(customerWsMapper.toBean(customerWs));
        //customerRepository.save(customers);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable ObjectId id) {
        customerRepository.delete(customerRepository.findBy_id(id));
    }

}
