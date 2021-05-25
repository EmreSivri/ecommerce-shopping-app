package com.ecommerce.shoppingapp.product.repository.es;

import com.ecommerce.shoppingapp.product.domain.elasticsearch.ProductEs;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;

public interface ProductEsRepository extends ReactiveElasticsearchRepository<ProductEs, String> {
}
