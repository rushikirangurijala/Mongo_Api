package com.example.mongoapi.repository;

import com.example.mongoapi.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
    // MongoRepository provides basic CRUD operations out of the box
} 