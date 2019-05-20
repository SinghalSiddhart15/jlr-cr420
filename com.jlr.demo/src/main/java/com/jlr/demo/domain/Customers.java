package com.jlr.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customers {
    @Id
    public ObjectId _id;
    public String firstName;
    public String lastName;
    private String address;
    private long phoneNumber;

//    public String get_id() {
//        return _id.toHexString();
//    }
//
//    public void set_id(ObjectId _id) {
//        this._id = _id;
//    }

}
