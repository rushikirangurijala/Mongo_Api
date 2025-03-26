package com.example.mongoapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;

    // Lombok @Data annotation will generate getters, setters, toString, equals, and
    // hashCode methods
}