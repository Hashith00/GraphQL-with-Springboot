package com.graphql.graphql.controller;

import com.graphql.graphql.entity.Product;
import com.graphql.graphql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @QueryMapping
    public List<Product> getAllProduct(){
        return productService.getAllProducts();
    }

    @QueryMapping
    public  List<Product> getAllProductsByCategory(@Argument String category){
        return productService.getAllProductsByCategory(category);
    }

    @MutationMapping
    public Product updateStock(@Argument Integer id, @Argument int stock){
        return productService.updateStock(id, stock);
    }

}
