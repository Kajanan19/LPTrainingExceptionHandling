import java.io.IOException;

public class AddToBasket {
	String itemName;
	 double itemPrice;
	 double discountGiven;
	 double finalTotal;
	 WriteToReport writeToReport=new WriteToReport();
	 String writeString;
	public void addItemsDetailsToBasket(String itemName, double itemPrice, double discountGiven, double finalTotal) throws IOException, ItemsNotFoundException {
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		this.discountGiven=discountGiven;
		this.finalTotal=finalTotal;
		writeString=itemName+" "+String.valueOf(itemPrice)+" "+String.valueOf(discountGiven)+" "+String.valueOf(finalTotal);
		System.out.println(writeString);
		writeToReport.writeToReportFile(writeString);
	}
}
