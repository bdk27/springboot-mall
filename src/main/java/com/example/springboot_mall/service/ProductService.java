package com.example.springboot_mall.service;

import com.example.springboot_mall.dto.ProductQueryParams;
import com.example.springboot_mall.dto.ProductRequest;
import com.example.springboot_mall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductBtId(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
