package gyak4_2;

public class Books {

	private String title;
	private String author; 
	private int release_year;
	private int price;
	
	public void increasePrice(int percent) {
		percent = percent/100;
		price = price + price*percent;
	}
	
	public String displayInfo() {
		return "C�m: " + title + ", �r�: " + author + ", Kiad�s �ve: " + release_year + ", �r: " + price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getRelease_year() {
		return release_year;
	}

	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
