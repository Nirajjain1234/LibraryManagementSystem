package LibraryManagementSystem;

import java.util.List;

public class MainUtil 
{
	public static void main (String args[]) throws Exception
	{
		Book obj1 = new Book("A-z1","Java","Raj",100,4,"prog");
		Book obj2 = new Book("abp","Python","Mayur",32,5,"it");
		
		Library lb = new Library();
		
		lb.setLname("Techademy");
		lb.setAddress("Banglore");
		
		lb.addbook(obj1);
		lb.addbook(obj2);
		
		SerializationHandler sh = new SerializationHandler();
		
		sh.serializeLibrary(lb,"library.txt");
		Library dt1 = sh.deserializeLibrary("library.txt");
		
		System.out.println(dt1.displayAvailableBooks());
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("ISBN | \t" + " Title |\t\t" + " Author |\t\t"+ " Price |\t\t" + " Availability |\t\t" + " Type |\t" );
		System.out.println("-------------------------------------------------------------------------------");
		
		for (int i =0;i<lb.displayAvailableBooks().size();i++)
		{
			Book dt = lb.displayAvailableBooks().get(i);
			
			System.out.println(dt.getISBN()+" \t"+dt.getTitle()+" \t"+ dt.getAuthor()+" \t"+dt.getPrice()+" \t"+ dt.getAvailability()+" \t"+dt.getGenre()+" \t");
		}
		
		//searchByAuthor
		
		String author = "Mayur";
		List<Book> sa =lb.searchByAuthor(author);
		if(sa.size()<=0)
		{
			throw new BookNotFoundException("The book is not available");
		}
		else
			System.out.println(sa);
		
		//search by genre
		String genre = "it";
		List<Book> lg =lb.searchByGenre(genre);
		if(lg.size()<=0)
		{
			throw new BookNotFoundException("The book is not available");
		}
		else
			System.out.println(lg);
		
		//remove book
		
		String isbn ="hhh";
		lb.removeBook(isbn);
		
		//borrow book
		Member mb = new Member();
		mb.setID(11);
		mb.setName("Hero");
		mb.setQnty(10);
		
		String bisbn ="abp";
		
		for (int i=0;i<lb.displayAvailableBooks().size();i++)
		{
			Book bk = lb.displayAvailableBooks().get(i);
			
			if(mb.getQnty()<bk.getAvailability())
			{
				mb.borrowBook(bisbn);
				
			}
			else
			{
				throw new NotEnoughBooksException(bisbn +" not enough books ");
			}
		}
		
		//display borrow books
		System.out.println(mb.displayBorrowedBooks());
		
		//return book
		mb.returnBook(bisbn);
			
		
	}
}
