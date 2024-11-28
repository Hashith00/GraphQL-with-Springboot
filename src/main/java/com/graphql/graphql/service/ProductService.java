package com.graphql.graphql.service;

import com.graphql.graphql.entity.Product;
import com.graphql.graphql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> getAllProductsByCategory(String category){
        return productRepository.findByCategory(category);
    }

    public Product updateStock(Integer id, int stock){
        Product wantedProduct = productRepository.findById(id).orElseThrow(()-> new RuntimeException("No product found"));
        wantedProduct.setQuantity(wantedProduct.getQuantity() + stock);
        return wantedProduct;
    }
}
