package com.hagydev.inventory_api.mapper;

import com.hagydev.inventory_api.dto.ProductRequest;
import com.hagydev.inventory_api.dto.ProductResponse;
import com.hagydev.inventory_api.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public Product toEntity(ProductRequest request) {
        Product product = new Product();

        product.setName(request.name());
        product.setPrice(request.price());
        product.setQuantity(request.quantity());
        product.setIsActive(request.isActive());

        return product;
    }

    public ProductResponse toResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getQuantity(),
                product.getIsActive()
        );
    }
}
