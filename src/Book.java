
public class Book {	
	
	private String title;
	private String author;
	private String description;
	private double price;
	private boolean isInstock;
	
	Book() {
	    title="Harry Potty";
	    author="J. K. Rowling";
	    description="magic";
	    price=15.99;
	    isInstock=true;
	}
	
	Book(String strtitle, String strauthor, String strdescription,double douprice,boolean booisInstock){
		
		title=strtitle;
		author=strauthor;
		description=strdescription;
		price=douprice;
		isInstock=booisInstock;
		
	}
	
	//Getter and setter methods
	   public String gettitle() {
	       return title;
	   }
	   public void settitle(String strtitle) {
	       this.title = strtitle;
	   }
	   public String getauthor() {
	       return author;
	   }
	   public void setauthor(String strauthor) {
	       this.author = strauthor;
	   }
	   public String getdescription() {
	       return description;
	   }
	   public void setdescritpion(String strdescription) {
	       this.description = strdescription;
	   }
	   public double getprice() {
	       return price;
	   }
	   public void setprice(double douprice) {
	       this.price = douprice;
	   }
	   public boolean getisInstock() {
	       return isInstock;
	   }
	   public void setisInstock(boolean booisInstock) {
	       this.isInstock = booisInstock;
	   }
	   
	   public void getDisplayText() 
	   {
		   String disauthor=author;
		   String distitle=title;
		   String disdescription=description;
		   
		   System.out.println("Author: "+disauthor);
		   System.out.println("Title: "+distitle);
		   System.out.println("Description: "+ disdescription);
	   }
	
	
	

}
