package Order;

import java.util.ArrayList;

import User.User;

public class Order {
	private User client;
	private User delivery;
	private Order_status status;
	private ArrayList<Product> product_list = new ArrayList<Product>();
	private int ID;
	private static int ID_counter = 0;
	//work in progress
	public Order(User client, User delivery) {
		this.client = client;
		this.delivery = delivery;
		/*
		to be completed after finishing Order_status class
		this status = 
		 */
		this.ID = ID_counter;
		ID_counter ++;
	}
}
