package com.hagydev.inventory_api.service.impl;

import com.hagydev.inventory_api.dto.ProductResponse;
import com.hagydev.inventory_api.entity.Product;
import com.hagydev.inventory_api.exception.ProductNotFoundException;
import com.hagydev.inventory_api.mapper.ProductMapper;
import com.hagydev.inventory_api.repository.ProductRepository;
import com.hagydev.inventory_api.service.ProductService;
import org.springframework.stereotype.Service;
import com.hagydev.inventory_api.dto.ProductRequest;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public List<ProductResponse> findAll() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::toResponse)
                .toList();
    }

    @Override
    public ProductResponse findById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Producto no encontrado"));
        return productMapper.toResponse(product);
    }

    @Override
    public ProductResponse save(ProductRequest request) {
        Product product = productMapper.toEntity(request);

        product.setName(request.name());
        product.setPrice(request.price());
        product.setQuantity(request.quantity());
        product.setIsActive(request.isActive());

        Product savedProduct = productRepository.save(product);

        return productMapper.toResponse(savedProduct);
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

        return productMapper.toResponse(updatedProduct);
    }

    @Override
    public void delete(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Producto no encontrado"));
        productRepository.delete(product);
    }
}
