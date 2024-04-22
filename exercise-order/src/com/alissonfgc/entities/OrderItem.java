package com.alissonfgc.entities;

public class OrderItem {
	private int quantity;
	private Double price;
	
	//relation
	private Product product;
	
	public OrderItem(int quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;	
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Double SubTotal() {
		return price * quantity;
	}
	
}
