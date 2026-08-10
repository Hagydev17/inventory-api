package com.hagydev.inventory_api.service;

import com.hagydev.inventory_api.dto.ProductRequest;
import com.hagydev.inventory_api.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    List<ProductResponse> findAll();
    ProductResponse findById(Long id);
    ProductResponse save(ProductRequest request);
    ProductResponse update(Long id, ProductRequest request);
    void delete(Long id);
}
