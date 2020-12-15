import java.io.IOException;
import java.util.InputMismatchException;

public class CalculateTotalService  {
	double total;
	
	public double calculateTotal(double total, double discount) throws InputMismatchException, ItemsNotFoundException {
		return total=total-discount;
	}
}
