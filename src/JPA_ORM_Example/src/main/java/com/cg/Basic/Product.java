package com.cg.Basic;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "ProductData")
public class Product {

    @Id
    @Column(name = "Product_id")
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "my_seq")
    @SequenceGenerator(name = "my_seq",sequenceName = "Prod_seq",allocationSize = 5,initialValue = 100)

    private int pid;
    @Column(name = "Product_name")
    private String name;
    @Column(name = "Product_price")
    private double price;
    @Column(name = "Product_quantity")
    private int quantity;
    @Column(name = "Product_dom")
    private LocalDate dom;

    // 1️⃣ Default Constructor
    public Product() {
    }

    // 2️⃣ Parameterized Constructor
    public Product( String name, double price, int quantity, LocalDate dom) {
       // this.pid = pid;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.dom = dom;
    }

    // 3️⃣ Getters and Setters

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDom() {
        return dom;
    }

    public void setDom(LocalDate dom) {
        this.dom = dom;
    }

    // 4️⃣ toString Method (Optional but Recommended)

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", dom=" + dom +
                '}';
    }
}