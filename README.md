# MongoDB REST API

This is a Spring Boot application that provides REST APIs to interact with MongoDB.

## Prerequisites

- Java 17 or higher
- Maven
- MongoDB (running on localhost:27017)

## Setup

1. Make sure MongoDB is running on your local machine
2. Clone this repository
3. Build the project:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

### Get all products
```
GET /api/products
```

### Get product by ID
```
GET /api/products/{id}
```

### Create new product
```
POST /api/products
Content-Type: application/json

{
    "name": "Product Name",
    "description": "Product Description",
    "price": 99.99
}
```

## Sample cURL Commands

### Get all products
```bash
curl http://localhost:8080/api/products
```

### Get product by ID
```bash
curl http://localhost:8080/api/products/{id}
```

### Create new product
```bash
curl -X POST -H "Content-Type: application/json" -d '{
    "name": "Sample Product",
    "description": "This is a sample product",
    "price": 29.99
}' http://localhost:8080/api/products
``` 