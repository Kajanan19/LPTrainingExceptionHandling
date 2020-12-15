import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToReport {
	String readString;
	public void writeToReportFile(String writeDetails) throws IOException, ItemsNotFoundException {
		
		PrintWriter printWriter=null;

		//Writing the file
		//Giving the path of File to write
		printWriter=new PrintWriter("C:\\Users\\kajanan\\Desktop\\Result.txt");
		
		this.readString=writeDetails;
		System.out.println("Goin to Report:"+readString);
		
		printWriter.println(readString);
        
        System.out.println("Printed to file Succesfully!");
        
        printWriter.close();
  
	}
}
