package com.hibernatedemo.hibernate.service;

import com.hibernatedemo.hibernate.entity.Product;
import com.hibernatedemo.hibernate.entity.ProductDetails;
import com.hibernatedemo.hibernate.repo.ProductRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    private final ProductRepository repo;

    public ProductService(ProductRepository repo){
        this.repo=repo;
    }

    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public ProductDetails getProduct(Long id) {
        return repo.findById(id).orElse(null);
    }

}
