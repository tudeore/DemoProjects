package com.capgemini.cartservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.cartservice.entity.Cart;
import com.capgemini.cartservice.exceptions.CartNotFoundException;
import com.capgemini.cartservice.repository.CartRepository;
import com.capgemini.cartservice.service.CartService;

@RunWith(MockitoJUnitRunner.class)
public class CartServiceTest {

	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private CartService cartService;


	@Test
	public void testGetCart() throws Exception {
		Cart cart = cartService.getcartById(104);
		System.out.println(cart);
		
	}

	@Test(expected = CartNotFoundException.class)
	public void testCartNotFound() throws Exception {
		
	}

	@Test
	public void testUpdateCart() throws Exception {
		
	}
	
}
