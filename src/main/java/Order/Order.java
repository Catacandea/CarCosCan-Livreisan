package Order;

import java.util.ArrayList;

import User.User;

public class Order {
	private User customer;
	private User delivery;
	private Order_status status;
	private ArrayList<Product> product_list;
	private double price;
	private int ID;
	private static int ID_counter = 0;
	//work in progress
	public Order(User client, User delivery){
		this.customer = customer;
		this.delivery = delivery;
		this.status = Order_status.PENDING;
		this.ID = ID_counter;
		this.price = 0;
		ID_counter ++;
		product_list = new ArrayList<Product>();
		
	}
	public void add_product(Product new_product) {
		product_list.add(new_product);
		price = price + new_product.getPrice();
	}
	public User getCustomer() {
		return customer;
	}
	public void setCustomer(User client) {
		this.customer = customer;
	}
	public User getDelivery() {
		return delivery;
	}
	public void setDelivery(User delivery) {
		this.delivery = delivery;
	}
	public Order_status getStatus() {
		return status;
	}
	public void setStatus(Order_status status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		String return_value = "Product list: ";
		for(Product products: product_list) {
		return_value +=products.getName();
		}
		return return_value;
	}
}
