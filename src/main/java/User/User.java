package User;

import Review.Review;

abstract public class User {
	private String username;
	private Review review;

	public User(String username) {
		this.username = username;
		review = new Review();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String newUsername) {
		this.username = newUsername;
	}
}
