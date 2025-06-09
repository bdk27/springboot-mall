package com.example.springboot_mall.service;

import com.example.springboot_mall.dto.ProductRequest;
import com.example.springboot_mall.model.Product;

public interface ProductService {

    Product getProductBtId(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
