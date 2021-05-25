package com.ecommerce.shoppingapp.product.repository.mongo;

import com.ecommerce.shoppingapp.product.domain.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
}
