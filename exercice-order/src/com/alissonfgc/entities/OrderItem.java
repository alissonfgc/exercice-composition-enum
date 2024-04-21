package com.alissonfgc.entities;

public class OrderItem {
	private int quantity;
	private Double price;
	
	//relation
	private Product product;
	
	public OrderItem(int quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
		
	}
	
	public Double SubTotal() {
		return price * quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
