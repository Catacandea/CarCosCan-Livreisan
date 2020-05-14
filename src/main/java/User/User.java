package User;

import java.net.URL;

import Review.Review;

abstract public class User {

	private String username;
	private Review review;
	private URL email;

	private String phoneNumber;

	public User(String username, String phoneNumber, URL email) {
		this.username = username;
		this.email = email;
		this.phoneNumber = phoneNumber;
		review = new Review();
	}

	public URL getEmail() {
		return email;
	}

	public void setEmail(URL email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUsername() {
		return username;
	}

	public String showReview() {
		String returnValue = null;
		returnValue = review.toString();
		return returnValue;
	}

	public void getReview(int mark) {
		review.getReview(mark);
	}

	public void setUsername(String newUsername) {
		this.username = newUsername;
	}
}
