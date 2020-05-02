package User;

import java.util.ArrayList;

import Order.Order;
import Review.Review;

abstract public class User {
	private String username;
	private Review review;
	private ArrayList<Order> order_history = new ArrayList<Order>();
	public User(String username) {
		this.username = username;
		review = new Review();
	}
}
