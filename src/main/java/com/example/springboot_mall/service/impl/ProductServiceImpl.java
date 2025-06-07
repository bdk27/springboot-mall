package com.example.springboot_mall.service.impl;

import com.example.springboot_mall.dao.ProductDao;
import com.example.springboot_mall.model.Product;
import com.example.springboot_mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductBtId(Integer productId) {
        return productDao.getProductBtId(productId);
    }
}
