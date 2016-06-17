
public class Book {	
	
	private String sku;
	private String title;
	private String author;
	private String description;
	private double price;
	private boolean isInstock;
	
	
	
	Book() {
		sku="Java1008";
	    title="Harry Potty";
	    author="J. K. Rowling";
	    description="magic";
	    price=15.99;
	    isInstock=true;
	}
	
	Book(String strsku,String strtitle, String strauthor, String strdescription,double douprice,boolean booisInstock){
		
		sku=strsku;
		title=strtitle;
		author=strauthor;
		description=strdescription;
		price=douprice;
		isInstock=booisInstock;
		
	}
	
	//Getter and setter methods
	public String getsku() {
	       return sku;
	   }
	   public void setsku(String strsku) {
	       this.sku = strsku;
	   }
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
	   
	   public String gettitlebySku(String strsku)
	   {
		   return title;
	   }
	   public String getauthorbySku(String strsku)
	   {
		   return author;
	   }
	   public String getdescriptionbySku(String strsku)
	   {
		   return description;
	   }
	   public double getpricebySkU(String strsku)
	   {
		   return price;
	   }
	   public boolean getisInstockbySku(String strsku)
	   {
		   return isInstock;
	   }
	   
	   public String getDisplayText() 
	   {
		   String disauthor=author;
		   String distitle=title;
		   String disdescription=description;
		   
		   return "Author: "+disauthor+", Title: "+distitle+", Description: "+disdescription;
	   }
	   
	  
	
	

}
