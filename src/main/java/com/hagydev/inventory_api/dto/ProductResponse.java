package com.hagydev.inventory_api.dto;

import java.math.BigDecimal;

public record ProductResponse(
        Long id,
        String name,
        BigDecimal price,
        Integer quantity,
        Boolean isActive
) {}
