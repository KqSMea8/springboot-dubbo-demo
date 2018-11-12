package com.deepexi.dubbo.demo.api;

import com.deepexi.dubbo.demo.domain.eo.Product;

public interface ProductService {

    Object getProductList();

    Object getProductById(Integer id);

    Object createProduct(Product product);

    Object deleteProductById(Integer id);

}
