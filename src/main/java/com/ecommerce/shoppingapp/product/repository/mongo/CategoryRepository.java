package com.ecommerce.shoppingapp.product.repository.mongo;

import com.ecommerce.shoppingapp.product.domain.category.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {

}
