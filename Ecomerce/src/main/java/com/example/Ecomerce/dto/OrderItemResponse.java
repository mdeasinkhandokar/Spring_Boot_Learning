package com.example.Ecomerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data

public record OrderItemResponse(
        String productName,
        int quantity,
        BigDecimal totalPrice


) {
}
