package com.hagydev.inventory_api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProductRequest(
        @NotBlank(message = "Nombre obligatorio")
        String name,
        @Positive(message="El precio debe ser positivo")
        BigDecimal price,
        @Min(value = 0, message = "La cantidad debe ser igual ó mayor a 0")
        Integer quantity,
        @NotNull(message = "El estado es obligatorio")
        Boolean isActive
){}
