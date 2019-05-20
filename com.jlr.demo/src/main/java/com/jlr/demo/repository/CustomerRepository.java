package com.jlr.demo.repository;

import com.jlr.demo.domain.Customers;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customers, String> {
    Customers findBy_id(Object _id);

    Customers findByFirstName(String firstName);
}

