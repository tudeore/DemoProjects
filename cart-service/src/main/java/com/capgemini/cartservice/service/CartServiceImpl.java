package com.capgemini.cartservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.cartservice.entity.Cart;
import com.capgemini.cartservice.exceptions.CartNotFoundException;
import com.capgemini.cartservice.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;
	
	@Override
	public List<Cart> getallcarts() {
		cartRepository.findAll().toString();
		return cartRepository.findAll();
	}

	@Override
	public Cart getcartById(int cartid) {
		Cart cart =	cartRepository.findById(cartid).get();
		if(cart == null) {
			throw new CartNotFoundException();
		}
		return cart;
	}

	@Override
	public Cart updateCart(Cart cart) {
		return cartRepository.save(cart);
		
	}


}
