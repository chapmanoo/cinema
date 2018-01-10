package cinema;

public class Movie {

	public Movie(String title, String genre, String ageRating) {
		super();
		this.title = title;
		this.genre = genre;
		this.ageRating = ageRating;
	}

	private String title;
	private String genre;
	private String ageRating;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(String ageRating) {
		this.ageRating = ageRating;
	}
}
