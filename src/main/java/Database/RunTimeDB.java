package Database;

import User.User;

import java.util.ArrayList;
import java.util.HashMap;

import Order.Order; 
public class RunTimeDB extends AbstractDB {
	//each User will have the data stored as user, and the key of each user will be the password
	private HashMap<User,String> users = new HashMap<User,String>();
	//each order will be stored in the ArrayList
	private ArrayList<Order> order = new ArrayList<Order>();
	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User create(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
