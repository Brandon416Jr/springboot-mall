package com.jrlo.springbootmall.dao;

import com.jrlo.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
