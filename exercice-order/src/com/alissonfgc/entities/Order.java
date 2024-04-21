package com.alissonfgc.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.alissonfgc.entities.enums.OrderStatus;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status;
	
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
	
	public void addContract(OrderItem items) {
		this.items.add(items);
	}
	
	public void removeContract(OrderItem items) {
		this.items.remove(items);
	}
	
}
