package ru.serdyukovip.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.serdyukovip.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
