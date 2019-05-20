package com.jlr.demo.controller.ws;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.bson.types.ObjectId;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerWs {
    public ObjectId _id;
    public String firstName;
    public String lastName;
    private String address;
    private long phoneNumber;
}
