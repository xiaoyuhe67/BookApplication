import java.util.Scanner;

public class BookDatabase {
	
	static Book[] mybooks=new Book[100];
	
	static int count=5;
	
	static Scanner sc=new Scanner (System.in);
	private static String sku;
	private static String title;
	private static String author;
	private static String description;
	private static String price;
	private static String isInstock;
	
	
	public void createBookDatabase()
	{
		Book book1=new Book("Java1001","Head First Java","Kathy Sierra and Bert Bates","Easy to read Java workbook",47.50,true);
		Book book2=new Book("Java1002","Thinking in Java","Bruce Eckel","Details about Java under the hood",20.00,true);
		Book book3=new Book("Orcl1003","OCP: Oracle Certified Professional Java SE","Jeanne Boyarsky","Everything you need to know in one place",45.00,true);
		Book book4=new Book("Python1004","Automate the Boring Stuff with Python","Al Sweigart","Fun with Python",10.50,true);
		Book book5=new Book("Zombie1005","The Maker's Guide to the Zombie Apocalypse","Simon Monk","Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi",16.50,true);
		Book book6=new Book("Rasp1006","Raspberry Pi Projects for the Evil Genius","Donald Norris","A dozen fiendishly fun projects for the Raspberry Pi!",14.75,true);
		
		mybooks[0]=book1;
		mybooks[1]=book2;
		mybooks[2]=book3;
		mybooks[3]=book4;
		mybooks[4]=book5;
		mybooks[5]=book6;
		
		while(1>0){
		
		System.out.println("Create books or press -1 to quit");
		
		System.out.println("Please enter the sku of the book");
		sku=sc.next();
		
		if(sku.equals("-1"))
		{
			break;
		}
				
		System.out.println("Please enter the title of the book");
		title=sc.next();
		
		if(title.equals("-1"))
		{
			break;
		}
		
		System.out.println("Please enter the author of the book");
		author=sc.next();
		
		if(author.equals("-1"))
		{
			break;
		}
		
		System.out.println("Please enter the description of the book");
		description=sc.next();
		
		if(description.equals("-1"))
		{
			break;
		}
		
		System.out.println("Please enter the price of the book");
		price=sc.next();
		
		if(price.equals("-1"))
		{
			break;
		}
		
		System.out.println("Please enter the isInstock of the book");
		isInstock=sc.next();;
		
		if(isInstock.equals("-1"))
		{
			break;
		}
			
		
		Book newbook=new Book(sku,title,author,description,Double.parseDouble(price),Boolean.parseBoolean(isInstock));
		
		mybooks[count]=newbook;
		
		count++;
		
		
		}
		
	}
	
	public int getCount()
	{
		 return this.count;
	}
	
	public Book searchBooks(String sku)
	{
		for(int i=0; i<getCount();i++)
		{
			if(mybooks[i].getsku().equals(sku))
			{
				return mybooks[i];
			}
			else
			{
				System.out.println("There is no book with sku "+sku);
			}
		}
		return mybooks[0];
		
	}
	

}
