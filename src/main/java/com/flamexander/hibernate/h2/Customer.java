package com.flamexander.hibernate.h2;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable (
            name = "customers_products",
            joinColumns = @JoinColumn (name = "customer_id"),
            inverseJoinColumns = @JoinColumn (name = "product_id")
    )

    private List<Product> productList;

    public Customer() {
    }

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Customer" + id + "name" + name);
    }
}
