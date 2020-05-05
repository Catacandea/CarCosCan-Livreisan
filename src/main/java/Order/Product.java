package Order;

import User.User;

public abstract class Product {
	private String name;
	private User provider;
	private Product_type type;
	private double price;
	public Product(String name, User provider,Product_type type, double price) {
		this.name =name;
		this.provider = provider;
		this.type = type;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User getProvider() {
		return provider;
	}
	public void setProvider(User provider) {
		this.provider = provider;
	}
	public Product_type getType() {
		return type;
	}
	public void setType(Product_type type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
