package com.jrlo.springbootmall.service;

import com.jrlo.springbootmall.dto.ProductRequest;
import com.jrlo.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
