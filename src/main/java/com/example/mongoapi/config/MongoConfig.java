package com.example.mongoapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.mongoapi.repository")
public class MongoConfig {
    // Configuration is handled through application.properties
} 