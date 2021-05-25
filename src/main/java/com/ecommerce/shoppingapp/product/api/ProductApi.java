package com.ecommerce.shoppingapp.product.api;

import com.ecommerce.shoppingapp.product.model.product.ProductDetailResponse;
import com.ecommerce.shoppingapp.product.model.product.ProductResponse;
import com.ecommerce.shoppingapp.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/products")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ProductApi {

    private final ProductService productService;

    @GetMapping
    public Flux<ProductResponse> getAllProducts() {
        return productService.getALl();
    }

    @GetMapping(value = "/{id}")
    public Mono<ProductDetailResponse> getProductDetail(@PathVariable("id") String id) {
        return productService.getProductDetail(id);
    }
}
