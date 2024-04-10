package LibraryManagementSystem;

import java.io.Serializable;
public class Book  implements Serializable
{

	private static final long serialVersionUID = 1L;
	private String ISBN;
	private String  Title;
	private String author;
	private int price;
	private int availability;
	private String genre;
	
	// Constructors
	public Book() {}
	
	
	public Book(String iSBN, String title, String author, int price, int availability, String genre) 
	{
		
		ISBN = iSBN;
		Title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
		this.genre = genre;
	}


	// Getters and Setters
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	// toString method 
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", Title=" + Title + ", author=" + author + ", price=" + price + ", availability="
				+ availability + ", genre=" + genre + "]";
	}
	
	
	

}
