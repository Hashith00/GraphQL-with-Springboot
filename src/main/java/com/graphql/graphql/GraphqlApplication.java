package com.graphql.graphql;

import com.graphql.graphql.entity.Product;
import com.graphql.graphql.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class GraphqlApplication {


	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

}
