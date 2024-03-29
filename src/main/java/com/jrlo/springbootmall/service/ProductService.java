package com.jrlo.springbootmall.service;

import com.jrlo.springbootmall.dao.ProductQueryParams;
import com.jrlo.springbootmall.dto.ProductRequest;
import com.jrlo.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
