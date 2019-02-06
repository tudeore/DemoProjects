package com.capgemini.cartservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.capgemini.cartservice.entity.Cart;
import com.capgemini.cartservice.entity.Product;
import com.capgemini.cartservice.repository.CartRepository;
import com.capgemini.cartservice.service.CartServiceImpl;

@SpringBootApplication
public class CartServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartServiceApplication.class, args);
		
		CartServiceImpl cv = new CartServiceImpl();
		//cv.getallcarts().toString();
		//System.out.println(cv.getcartById(100));
	}

	@Bean
	public CommandLineRunner populateData(CartRepository repository) {
		return (arg) -> {
			repository.save(new Cart(100,1,new Product(100, "Nokia", "Electronics")));
			repository.save(new Cart(101,1,new Product(101, "Samsung", "Electronics")));
			repository.save(new Cart(102,1,new Product(102, "iphone", "Electronics")));
			repository.save(new Cart(103,1,new Product(103, "Redmi", "Electronics")));
			repository.save(new Cart(104,1,new Product(104, "Sony", "Electronics")));
		};
	}
}

