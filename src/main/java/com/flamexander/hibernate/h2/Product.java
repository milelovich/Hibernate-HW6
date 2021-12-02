package com.flamexander.hibernate.h2;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "customers")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private int price;

        @ManyToMany
        @JoinTable (
                name = "customers_products",
                joinColumns = @JoinColumn (name = "product_id"),
                inverseJoinColumns = @JoinColumn (name = "customer_id")
        )
    List<Customer> customers;

    public Product() {
    }

    public Product(Long id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Product" + id + "title" + title + "price" + price);
    }
}