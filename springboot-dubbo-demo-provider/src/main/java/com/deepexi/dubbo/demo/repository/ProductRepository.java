package com.deepexi.dubbo.demo.repository;

import com.deepexi.dubbo.demo.domain.eo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}