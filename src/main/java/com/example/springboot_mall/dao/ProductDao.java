package com.example.springboot_mall.dao;

import com.example.springboot_mall.dto.ProductRequest;
import com.example.springboot_mall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts();

    Product getProductBtId(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
