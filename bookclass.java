package bookstore;

public class bookclass {
	
	int id;
	String book_name;
	String book_author;
	double price;
	public bookclass(int id, String book_name, String book_author, int price) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.book_author = book_author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "bookclass [id=" + id + ", book_name=" + book_name + ", book_author=" + book_author + ", price=" + price
				+ "]";
	}
	
	
}
