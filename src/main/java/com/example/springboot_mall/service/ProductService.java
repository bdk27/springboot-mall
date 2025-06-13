package com.example.springboot_mall.service;

import com.example.springboot_mall.constant.ProductCategory;
import com.example.springboot_mall.dto.ProductRequest;
import com.example.springboot_mall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductBtId(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
