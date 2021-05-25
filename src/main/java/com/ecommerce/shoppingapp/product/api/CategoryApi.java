package com.ecommerce.shoppingapp.product.api;

import com.ecommerce.shoppingapp.product.model.category.CategoryResponse;
import com.ecommerce.shoppingapp.product.service.category.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "/category")
@RequiredArgsConstructor
@CrossOrigin("*")
public class CategoryApi {

    private final CategoryService categoryService;

    @GetMapping
    public Flux<CategoryResponse> getAll() {
        return categoryService.getAll();
    }
}
