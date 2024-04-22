package com.alissonfgc.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.alissonfgc.entities.enums.OrderStatus;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status;
	static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	static DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	//relations
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {}
	
	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addOrderItem(OrderItem items) {
		this.items.add(items);
	}
	
	public void removeOrderItem(OrderItem items) {
		this.items.remove(items);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nORDER SUMMARY:\n");
		sb.append("Order moment: " + moment.format(fmt1));
		sb.append("\nOrder status: " + status);
		sb.append("\nClient: " + client.getName() + " (" + client.getBirthDate().format(fmt2) + ") - " + client.getEmail());
		sb.append("\nOrder items:");
		Double totalPrice = 0.0;
		for(OrderItem i: items) {
			sb.append("\n" + i.getProduct().getName() + ", $" + i.getProduct().getPrice() + ", Quantity: " + i.getQuantity() + ", Subtotal: $" + i.SubTotal());
			totalPrice = i.SubTotal() + totalPrice;
		}
		sb.append("\nTotal price: " + totalPrice);
		
		return sb.toString();
	}
	
}
