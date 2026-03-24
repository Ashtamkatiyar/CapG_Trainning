package com.example.orders.dto;

import jakarta.validation.constraints.*;

public class OrderRequestDTO {

    @NotBlank(message = "Customer name can not be blank")
    @Size(min = 3, message = "Customer name length must be at least 3")
    private String customerName;

    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Product name is required")
    private String productName;

    @NotNull(message = "Quantity is required")
    @Positive(message = "Quantity must be greater than 0")
    private Integer quantity;

    @NotNull(message = "Price per unit is required")
    @Positive(message = "Price per unit must be greater than 0")
    private Double pricePerUnit;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(Double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public OrderRequestDTO(String customerName, String email, String productName, Integer quantity, Double pricePerUnit) {
        this.customerName = customerName;
        this.email = email;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public OrderRequestDTO() {
    }
}
