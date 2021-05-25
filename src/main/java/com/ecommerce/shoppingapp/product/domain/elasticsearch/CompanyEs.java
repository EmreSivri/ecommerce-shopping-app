package com.ecommerce.shoppingapp.product.domain.elasticsearch;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyEs {
    private String id;
    private String name;
    private String code;
}
