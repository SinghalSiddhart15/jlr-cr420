package com.jlr.demo.controller.mapper;

import com.jlr.demo.controller.ws.CustomerWs;
import com.jlr.demo.core.mapper.Mapper;
import com.jlr.demo.service.bean.CustomerBean;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class CustomerWsMapper implements Mapper<CustomerBean, CustomerWs> {

    @Override
    public CustomerWs fromBean(CustomerBean customerBean) {
        return Objects.isNull(customerBean) ? null : CustomerWs.builder()._id(customerBean.get_id())
                .address(customerBean.getAddress()).firstName(customerBean.getFirstName())
                .lastName(customerBean.getLastName()).address(customerBean.getAddress())
                .phoneNumber(customerBean.getPhoneNumber()).build();
    }

    @Override
    public CustomerBean toBean(CustomerWs customerWs) {
        return Objects.isNull(customerWs) ? null : CustomerBean.builder()._id(customerWs.get_id())
                .address(customerWs.getAddress()).firstName(customerWs.getFirstName())
                .lastName(customerWs.getLastName()).address(customerWs.getAddress())
                .phoneNumber(customerWs.getPhoneNumber()).build();
    }
}
