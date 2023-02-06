package AssignmentExam;
import java.util.Scanner;
public class CricketPromo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] cart = {"round-neck", "collared", "hooded", "round-neck", "round-neck"};
		double totalCost = 0;
		double finalAmount;
		// Calculating total cost of all T-Shirts in the cart
		for (int i = 0; i < cart.length; i++) {
		  if (cart[i].equals("round-neck")) {
		    totalCost += 200;
		  } else if (cart[i].equals("collared")) {
		    totalCost += 250;
		  } else if (cart[i].equals("hooded")) {
		    totalCost += 300;
		  }
		}

		// Calculating discount based on the number of T-Shirts ordered
		int numberOfTShirts = cart.length;
		double discount = 0;
		if (numberOfTShirts < 5) {
		  discount = 0;
		} else if (numberOfTShirts >= 5 && numberOfTShirts <= 10) {
		  discount = 10;
		} else if (numberOfTShirts > 10) {
		  discount = 20;
		}

		// Calculating final amount after applying discount
		finalAmount = totalCost - (totalCost * (discount / 100));

		// Displaying final amount
		System.out.println("Final price is Rs. " + finalAmount);
}
}