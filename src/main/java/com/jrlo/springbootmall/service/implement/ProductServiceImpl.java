package com.jrlo.springbootmall.service.implement;

import com.jrlo.springbootmall.dao.ProductDao;
import com.jrlo.springbootmall.model.Product;
import com.jrlo.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
