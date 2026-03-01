package com.example.Ecomerce.service;


import com.example.Ecomerce.dto.OrderItemRequest;
import com.example.Ecomerce.dto.OrderItemResponse;
import com.example.Ecomerce.dto.OrderRequest;
import com.example.Ecomerce.dto.OrderResponse;

import com.example.Ecomerce.model.Order;
import com.example.Ecomerce.model.OrderItem;
import com.example.Ecomerce.model.Product;
import com.example.Ecomerce.repo.OrderRepo;
import com.example.Ecomerce.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class  OrderService {

 @Autowired
private ProductRepo productRepo;
private OrderRepo orderRepo;

    public OrderResponse placeOrder(OrderRequest request) {

         Order order = new Order();
         String orderId="ORD"+ UUID.randomUUID().toString().substring(0,8).toUpperCase();
         order.setOrderId(orderId);
         order.setCustomerName(request.customerName);
         order.setEmail(request.email());
         order.setStatus("PLACED");
         order.setOrderDate(LocalDate.now());



        List<OrderItem> orderItems= new ArrayList<>();
        for(OrderItemRequest itemReq: request.items()){
            Product product = productRepo.findById(itemReq.productId())
                    .orElseThrow(()-> new RuntimeException("Product not found"));

            product.setStockQuantity(product.getStockQuantity()- itemReq.quantity());
            productRepo.save(product);

            OrderItem orderItem=  OrderItem.builder()
                    .product(product)
                    .quantity(itemReq.quantity())
                    .totalPrice(product.getPrice().multiply(BigDecimal.valueOF(itemReq.quantity())))
                    .order(order)
                    .build();


                    orderItems.add(orderItem);

        }
        List<OrderItemResponse> itemResponses = new ArrayList<>();
        for(OrderItem item : order.getOrderItems()){
            OrderItemResponse orderItemResponse = new OrderItemResponse(
                    item.getProduct().getName(),
                    item.getQuantity(),
                    item.getTotalPrice()
            );
            itemResponses.add(orderItemResponse);
        }




        order.setOrderItems(orderItems);
        Order savedOrder= orderRepo.save(order);
        OrderResponse orderResponse = new OrderResponse(
                savedOrder.getOrderId(),
                savedOrder.getCustomerName(),
                savedOrder.getEmail(),
                savedOrder.getStatus(),
                savedOrder.getOrderData(),
                itemResponses
        );




        return null;

    }






    public List<OrderResponse> getAllOrdersReponse() {

        List<Order>orders =orderRepo.findAll();
        List<OrderResponse>orderResponses= new ArrayList<>();

        for(Order order : orders){

            for(OrderItem item : order.getOrderItems()){
                OrderItemResponse orderItemResponse = new OrderItemResponse(
                        item.getProduct().getName(),
                        item.getQuantity(),
                        item.getTotalPrice()
                );
                itemResponses.add(orderItemResponse);
            }


            OrderResponse orderResponse= new OrderResponse(
                    order.getOrderId(),
                    savedOrder.getCustomerName(),
                    savedOrder.getEmail(),
                    savedOrder.getStatus(),
                    savedOrder.getOrderData(),
                    itemResponses

            );

           orderResponses.add(orderResponse);
        }


        return  orderResponse;
    }
}
