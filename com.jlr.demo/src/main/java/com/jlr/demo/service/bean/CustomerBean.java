package com.jlr.demo.service.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.bson.types.ObjectId;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerBean {
    public ObjectId _id;
    public String firstName;
    public String lastName;
    private String address;
    private long phoneNumber;
}
