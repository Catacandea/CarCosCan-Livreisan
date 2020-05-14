package User;

import java.net.URL;
import java.util.ArrayList;

import Order.Order;
import Order.OrderStatusEnum;

public class DeliveryCompany extends User {
	private String phoneNumber;
	private Order order;

	public DeliveryCompany(String username, URL email, String phoneNumber) {
		super(username, phoneNumber, email);
	}

	public void assignOrder(Order wanted) {
		order = wanted.getOrder(this);
	}

	public void getOrder() {
		order.toString();
	}

	public void viewOrders(ArrayList<Order> orders) {
		for (Order auxOrder : orders) {
			auxOrder.toString();
		}
	}

	public void finishOrder(int mark) {
		order.getCustomer().getReview(mark);
		OrderStatusEnum status = OrderStatusEnum.FINISH;
		order.setStatus(status);
		order = null;
	}

	public Order cancelOrder() {
		Order aux = order;
		aux.cancelOrder();
		order = null;
		return aux;
	}

}
