package com.hibernatedemo.hibernate;

import com.hibernatedemo.hibernate.entity.ProductDetails;
import com.hibernatedemo.hibernate.repo.ProductRepository;
import com.hibernatedemo.hibernate.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductService service;
    private final ProductRepository repo;

    public DataLoader(ProductService service, ProductRepository repo) {
        this.service = service;
        this.repo = repo;
    }

    @Override
    public void run(String... args) {
        //repo.save(new ProductDetails(1L, "Laptop", 75000));

        System.out.println("First call");
        service.getProduct(1L);   // DB hit ✅

        System.out.println("Second call");
        service.getProduct(1L);   // L2 cache ✅
    }
}
