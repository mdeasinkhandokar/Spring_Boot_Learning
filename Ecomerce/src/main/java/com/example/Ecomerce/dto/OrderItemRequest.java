package com.example.Ecomerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public record OrderItemRequest (
    int productId,
    int quantity

) {}



