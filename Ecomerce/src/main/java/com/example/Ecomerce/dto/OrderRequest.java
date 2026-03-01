package com.example.Ecomerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List
@Data

public record OrderRequest(
        String customerName,
        String email,
        List<OrderItemRequest> items
) {



}
