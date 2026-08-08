package com.hagydev.inventory_api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Nombre obligatorio")
    private String name;
    @Positive(message = "El precio debe ser positivo")
    private BigDecimal price;
    @Min(value = 0, message = "La cantidad debe ser igual ó mayor a 0")
    private Integer quantity;
    @NotNull(message = "Es estado es obligatorio")
    private Boolean isActive;

    public Product() {}

    public Product(Long id, String name, BigDecimal price, Integer quantity, Boolean status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isActive = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getStatus() {
        return isActive;
    }

    public void setStatus(Boolean status) {
        this.isActive = status;
    }
}
