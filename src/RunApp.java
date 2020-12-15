import java.util.Scanner;

public class RunApp {
	
	
	
	public static void main(String[] args) throws ItemsNotFoundException  {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Continue?[Y/N]");
		
		while (sc.hasNext() && (sc.nextLine().equalsIgnoreCase("y"))) {
			//change here
		    System.out.println("Enter Item Name");
		    String nameyString = sc.nextLine();
		    
		    System.out.println("Enter Item Price");
		    double price=0;
		    try {
		    	 price = sc.nextDouble();
		    } catch (IllegalArgumentException e) {
		        e.printStackTrace();
		    }
		   
		    
		    System.out.println("Enter Discount Amount");
		    double discount = 0;
		    
		    try {
		    	discount = sc.nextDouble();
		    	if(discount>price) {
			    	throw new IllegalArgumentException("Discount exceeded!"); 
			    }
		    } catch (IllegalArgumentException e) {
		        e.printStackTrace();
		    }
		    
		    
		    double lastTotal=0;
		    try {
		    	CalculateTotalService calculateTotalService=new CalculateTotalService();
		    	lastTotal=calculateTotalService.calculateTotal(price, discount);
			} catch (Exception e) {
				// TODO: handle exception
				 e.printStackTrace();
			}
		    		
		    System.out.println("Total Amount to pay: "+lastTotal);
		    
		   
		    
		    
		    try {
		    	AddToBasket addToBasket=new AddToBasket();
		    	addToBasket.addItemsDetailsToBasket(nameyString, price, discount, lastTotal);
			} catch (Exception e) {
				// TODO: handle exception
				 e.printStackTrace();
			}
		    System.out.println("Items details Added to cart Successfully");
		    
		    System.out.println("Continue?[Y/N]");
		    
	
		}
		
		
		
		
	}
	
	
}
