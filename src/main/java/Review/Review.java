package Review;

public class Review {
	private double review;
	private int review_number;
	public Review() {
		review_number = 0;
		review = 0;
	}	
	void get_review(int review) {
		review_number++;
		this.review = review/review_number;
	}
	@Override
	public String toString() {
		return "Review = : " + review + "\n";
	}
}
