import java.util.Scanner;

public class BookApp {
	
	static Scanner sc=new Scanner(System.in);
	
	static BookDatabase database=new BookDatabase();
	
	static String[][] invoice=new String[100][5];
	
	static int count=0;
	static String sku;
	static int num=0;
	static String untaxable;
	static double price=0;
	static boolean isInstock=true;
	static String title;	
	static double pricetotal=0;
	
	static double taxablesubtotal=0;
	static double untaxablesubtotal=0;
	
	
	public static void main(String[] args)
	{
		database.createBookDatabase();
		
		while(1>0)
		{
			System.out.println("Enter Invoice or press -1 to quit");
			System.out.println("Please enter the sku of the book you want to buy");
		
		    sku=sc.next();
		    
		    if(sku.equals("-1"))
			{
				break;
			}	
		   
             System.out.println("Please enter the num of the book");
		
		     num=sc.nextInt();
		     
		     if(num==-1)
			  {
				break;
			  }
		    System.out.println("Please enter the untaxable of the book you want to buy");
				
			    untaxable=sc.next();
			    
			    if(untaxable.equals("-1"))
				{
					break;
				}
			    if(database.searchBooks(sku)!=null)
			    {
			    title=database.searchBooks(sku).gettitle();
			    price=database.searchBooks(sku).getprice();		    
				isInstock=database.searchBooks(sku).getisInstock();
			    
				pricetotal=pricingtotal(price,isInstock,num);
				
					invoice[count][0]=sku;
					invoice[count][1]=Integer.toString(num);
					invoice[count][2]=title;
					invoice[count][3]=(String.format("%.02f",price));
					invoice[count][4]=String.format("%.02f",pricetotal);
			    
				count++;
				if(untaxable.equals("true"))
				{
					untaxablesubtotal+=pricetotal;
				}
				else if (untaxable.equals("false"))
				{
					taxablesubtotal+=pricetotal;
				}  
			    }
			    
		     
		}
		 System.out.println("Item      Quantity      Description      Price      Price Total");
		 for(int k=0;k<=count-1;k++)
		 {
			 System.out.println(invoice[k][0]+"      "+invoice[k][1]+"      "+invoice[k][2]+"      "+invoice[k][3]+"      "+invoice[k][4]);
		 }
		 
		 
		System.out.println("Taxable Subtotal: $"+String.format("%.02f",taxablesubtotal));			
		System.out.println("Untaxable Subtotal: $"+String.format("%.02f",untaxablesubtotal));	
		System.out.println("Tax: $"+String.format("%.02f",(taxablesubtotal*0.06)));	
		System.out.println("Tax: $"+String.format("%.02f",((taxablesubtotal*1.06)+untaxablesubtotal)));
		      
	      
	       
	}
	
	public static double pricingtotal(double price, boolean isInstock, int num)
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
