package com.hagydev.inventory_api.service.impl;

import com.hagydev.inventory_api.dto.ProductResponse;
import com.hagydev.inventory_api.entity.Product;
import com.hagydev.inventory_api.exception.ProductNotFoundException;
import com.hagydev.inventory_api.repository.ProductRepository;
import com.hagydev.inventory_api.service.ProductService;
import org.springframework.stereotype.Service;
import com.hagydev.inventory_api.dto.ProductRequest;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductResponse> findAll() {
        return productRepository.findAll()
                .stream()
                .map(this::toResponse)
                .toList();
    }

    private ProductResponse toResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getQuantity(),
                product.getIsActive()
        );
    }

    @Override
    public ProductResponse findById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Producto no encontrado"));
        return toResponse(product);
    }

    @Override
    public ProductResponse save(ProductRequest request) {
        Product product = new Product();

        product.setName(request.name());
        product.setPrice(request.price());
        product.setQuantity(request.quantity());
        product.setIsActive(request.isActive());

        Product savedProduct = productRepository.save(product);

        return toResponse(savedProduct);
    }

    @Override
    public ProductResponse update(Long id, ProductRequest request) {
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Producto no encontrado"));
        existingProduct.setName(request.name());
        existingProduct.setPrice(request.price());
        existingProduct.setQuantity(request.quantity());
        existingProduct.setIsActive(request.isActive());

        Product updatedProduct = productRepository.save(existingProduct);

        return toResponse(updatedProduct);
    }

    @Override
    public void delete(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Producto no encontrado"));
        productRepository.delete(product);
    }
}
