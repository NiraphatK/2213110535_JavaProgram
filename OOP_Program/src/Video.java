
public class Video {
	private String title;
	private boolean checkedOut = false;
	private double avgRating;
	private int ratingSum = 0;
	private int ratingCount = 0;

	public void setTitle(String iTitle) {
		title = iTitle;
	}

	public String getTitle() {
		return title;
	}

	public void addRating(int rate) {
		ratingSum += rate;
		ratingCount += 1;
		avgRating = ratingSum / ratingCount;
	}

	public double getRating() {
		return avgRating;
	}

	public void checkOut() {
		checkedOut = true;
	}

	public void returnToStore() {
		checkedOut = false;
	}

	public boolean isCheckOut() {
		return checkedOut;
	}
}
