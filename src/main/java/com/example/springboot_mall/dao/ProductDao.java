package com.example.springboot_mall.dao;

import com.example.springboot_mall.model.Product;

public interface ProductDao {

    Product getProductBtId(Integer productId);
}
