package com.jrlo.springbootmall.service;

import com.jrlo.springbootmall.constant.ProductCategory;
import com.jrlo.springbootmall.dto.ProductRequest;
import com.jrlo.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
