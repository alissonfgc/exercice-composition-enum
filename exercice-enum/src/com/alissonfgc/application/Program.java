package com.alissonfgc.application;

import java.util.Date;

import com.alissonfgc.entities.Order;
import com.alissonfgc.entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
	}

}
