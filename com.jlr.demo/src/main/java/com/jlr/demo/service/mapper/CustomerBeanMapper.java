package com.jlr.demo.service.mapper;

import com.jlr.demo.domain.Customers;
import com.jlr.demo.service.bean.CustomerBean;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class CustomerBeanMapper {

    public CustomerBean toBean(Customers customers) {
        return Objects.isNull(customers) ? null : CustomerBean.builder()._id(customers.get_id())
                .address(customers.getAddress()).firstName(customers.getFirstName())
                .lastName(customers.getLastName()).address(customers.getAddress())
                .phoneNumber(customers.getPhoneNumber()).build();
    }

    public Customers fromBean(CustomerBean customerBean) {
        return Objects.isNull(customerBean) ? null : Customers.builder()._id(customerBean.get_id())
                .address(customerBean.getAddress()).firstName(customerBean.getFirstName())
                .lastName(customerBean.getLastName()).address(customerBean.getAddress())
                .phoneNumber(customerBean.getPhoneNumber()).build();
    }
}
