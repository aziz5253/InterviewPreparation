package com.hibernatedemo.hibernate.repo;

import com.hibernatedemo.hibernate.entity.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductDetails,Long> {
}
