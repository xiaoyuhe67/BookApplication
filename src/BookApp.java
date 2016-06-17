import java.util.Scanner;

public class BookApp {
	
	static Scanner sc=new Scanner(System.in);
	
	static BookDatabase database=new BookDatabase();
	
	
	public static void main(String[] args)
	{
		database.createBookDatabase();
					
		System.out.println("Please enter the sku of the book you want to buy");
		
		String sku=sc.next();
		
        System.out.println("Please enter the num of the book");
		
		int num=sc.nextInt();
		
		double price=database.searchBooks(sku).getprice();
		
		boolean isInstock=database.searchBooks(sku).getisInstock();
		
		System.out.println("The price is "+pricing(price,isInstock,num));
		System.out.println(database.searchBooks(sku).getDisplayText());
		      
	      
	       
	}
	
	public static double pricing(double price, boolean isInstock, int num)
	{
		if(isInstock)
		{
			return price*num;
		}
		else
		{
			System.out.println("The book is not instock");
		}
		return 0;
	}
	
	

}
