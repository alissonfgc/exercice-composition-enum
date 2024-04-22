package com.alissonfgc.application;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import com.alissonfgc.entities.Client;
import com.alissonfgc.entities.Order;
import com.alissonfgc.entities.OrderItem;
import com.alissonfgc.entities.Product;
import com.alissonfgc.entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String clientName = sc.next();
		System.out.print("Email: ");
		String clientEmail = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String clientBirth = sc.next();
		
		Client client1 = new Client(clientName, clientEmail, clientBirth);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String orderStatus = sc.next();
		
		Order order1 = new Order(LocalDateTime.now(), OrderStatus.valueOf(orderStatus), client1);
		
		System.out.print("How many items to this order? ");
		int qntOrderItems = sc.nextInt();
		int i;
		
		for (i = 1; i <= qntOrderItems; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Product quantity: ");
			int productQuantity = sc.nextInt();
			
			order1.addOrderItem(new OrderItem(productQuantity, productPrice, new Product(productName, productPrice)));
			
		}
		
		sc.close();
		
		System.out.println(order1.toString());
		
	}

}
