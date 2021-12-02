package com.flamexander.hibernate.h2;

import java.util.List;
import java.util.Optional;

public interface ProductDao {
    Product findById(Long id);
    List<Product> findAll();
    List<Customer> findByProductId(Long id);


}
