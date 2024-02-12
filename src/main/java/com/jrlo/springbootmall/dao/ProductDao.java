package com.jrlo.springbootmall.dao;

import com.jrlo.springbootmall.constant.ProductCategory;
import com.jrlo.springbootmall.dto.ProductRequest;
import com.jrlo.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
