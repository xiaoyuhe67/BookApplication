
public class BookApp {
	
	public static void main(String[] args)
	{
		   Book mybook1 = new Book();  //using constructor
	       System.out.println("Author: "+mybook1.getauthor());
	       System.out.println("Title: "+mybook1.gettitle());
	       System.out.println("Description: "+mybook1.getdescription());

	       //This object creation would call the parameterized
	       Book mybook2 = new Book("The Lord of the Rings", "J. R. R. Tolkien", "epic high-fantasy novel ",15.99,true);
	       System.out.println("Author: "+mybook2.getauthor());
	       System.out.println("Title: "+mybook2.gettitle());
	       System.out.println("Description: "+mybook2.getdescription()); 
	       
	       //Using getdisplaymethod
	       Book mybook3= new Book("The Hobbit","J. R. R. Tolkien","children's fantasy novel", 14.99, false);
	       mybook3.getDisplayText();
	}

}
