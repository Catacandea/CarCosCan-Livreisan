package User;

import java.util.ArrayList;

import Order.Product;
import Timetable.TimeSlot;
import Timetable.TimeSlotException;
import Timetable.Timetable;

public class SupplierCompany extends User {
	private Timetable timetable;
	private String phoneNumber, address;
	private ArrayList<Product> products;

	public SupplierCompany(String username, int to, int from, String phoneNumber, String address)
			throws TimeSlotException {
		super(username);
		timetable = new Timetable(new TimeSlot(to, from));
		this.phoneNumber = phoneNumber;
		this.address = address;
		products = new ArrayList<Product>();
	}

	public Timetable getTimetable() {
		return timetable;
	}

	public void setTimetable(Timetable timetable) {
		this.timetable = timetable;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void addProduct(Product newProduct) {
		products.add(newProduct);
	}

	public String showProducts() {
		String returnValue = "Products of Company:" + this.getUsername();
		for (Product product : products) {
			returnValue = returnValue + product.toString() + ", ";
		}
		returnValue = returnValue + "\n";
		return returnValue;
	}

	public void deleteProduct(String productName) {
		for (Product product : products) {
			if (product.equals(productName)) {
				products.remove(product);
			}
		}
	}

	@Override
	public String toString() {
		String returnValue = "Company : ";
		returnValue = returnValue + this.getUsername() + ", Phone number : " + this.getPhoneNumber() + ", Address: "
				+ this.getAddress();
		return returnValue;

	}
}
