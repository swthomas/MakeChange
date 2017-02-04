package labs;
import java.util.Scanner;

public class MakeChange {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		double totalAmount = 0;
		double amountTendered = 0;
		double change = 0;
		
		System.out.println("Total: ");
			totalAmount = sc.nextDouble();
		System.out.println("Amount Tendered: ");
			amountTendered = sc.nextDouble();
		System.out.println();
		change = amountTendered - totalAmount;
		
		checkChange(change);
		sc.close();
		
	}
	
	public static void checkChange(double change){
		if (change == 0)
			System.out.println("No Change Tendered");
		else if (change < 0)
			System.out.println("Need more $$$$$$");
		else if (change > 0)
			makeChange(change);
	}
	
	public static void makeChange(double change){ 
		double change1 = change;
		
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int one = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int pennies = 0;
				
		twenty = (int) (change1 / 20.00);
		change1 = change1 % 20;
		
		ten = (int) (change1 / 10.00);
		change1 = change1 % 10;
		
		five = (int) (change1 / 5.00);
		change1 = change1 % 5;
		
		one = (int) (change1 / 1.00);
		change1 = change1 % 1;
				
		quarter = (int) (change1 / .25);
		change1 = change1 % .25;
				
		dime = (int) (change1 / .10);
		change1 = change1 % .10;
				
		nickel = (int) (change1 / .05);
		change1 = change1 % .05;

		pennies = (int) Math.round(change1 / .01);
		
		
		System.out.print("Change: $");
		System.out.printf("%.2f", change);
		System.out.println();
		System.out.println("===================");
		if (twenty > 0)
			System.out.println("Twentys   " + twenty);
		if (ten > 0)	
			System.out.println("Tens      " + ten);
		if (five > 0)	
			System.out.println("Fives     " + five);
		if (one > 0)
			System.out.println("Ones      " + one);
		if (quarter > 0)
			System.out.println("Quarters  " + quarter);	
		if (dime > 0)
			System.out.println("Dimes     " + dime);
		if (nickel > 0)
			System.out.println("Nickels   " + nickel);
		if (pennies > 0)
			System.out.println("Pennies   " + pennies);
		}

}
		

