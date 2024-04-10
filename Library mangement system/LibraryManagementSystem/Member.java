package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Member extends Library
{
	private static final long serialVersionUID = 1L;
	
	private int ID;
	private String name;
	private List<Book> borrowedBooks;
	private int qnty;
	
	
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQnty() {
		return qnty;
	}

	public void setQnty(int qnty) {
		this.qnty = qnty;
	}

	Library lb = new Library();
	
	
	// Constructors 
	public Member()
	{
		Book obj1 = new Book("A-z1","Java","Raj",100,4,"prog");
		Book obj2 = new Book("abp","Python","Mayur",32,5,"it");
		
		lb.addbook(obj1);
		lb.addbook(obj2);
		
	}
	
	public Member(int iD, String name, int qnty) 
	{
	
		ID = iD;
		this.name = name;
		this.qnty = qnty;
	}
	
	public void borrowBook(String ISBN)
	{
		borrowedBooks = new ArrayList<>();
		for (Book b : lb.displayAvailableBooks())
		{
			if(ISBN.equals(b.getISBN()))
			{
				borrowedBooks.add(b);
			}
		}
		
	}
	
	public void returnBook(String ISBN)
	{
		List<Book> lbb =  displayBorrowedBooks();
		for (Book b : lbb)
		{
			if(b.getISBN().equals(ISBN))
			{
				lbb.remove(b);
				System.out.println(" Successfully Returned book "+ ISBN);
				break;
			}
		}
	}
	
	
	
	public List<Book> displayBorrowedBooks()
	{
		return borrowedBooks;
	}
	
	
	
	
	
	
	
}