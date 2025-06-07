package com.example.springboot_mall.dao.impl;

import com.example.springboot_mall.dao.ProductDao;
import com.example.springboot_mall.model.Product;
import com.example.springboot_mall.rowmapper.productRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductImpl implements ProductDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Product getProductBtId(Integer productId) {

        String sql = "SELECT product_id, product_name, category, image_url, price, stock, description, created_date, last_modified_date " +
                "FROM product WHERE product_id = :productId";

        Map<String, Object> map = new HashMap<>();
        map.put("productId", productId);

        List<Product> productList = namedParameterJdbcTemplate.query(sql, map, new productRowMapper());

        if (!productList.isEmpty()) {
            return productList.getFirst();
        } else {
            return null;
        }
    }
}
