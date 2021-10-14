/**
 * 
 */
package conditionals;

import java.util.Scanner;

/**
 * @author raven
 *
 */
public class LoanCalculator {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		
		int remaining = 0;
		int month;
		for (month = 1; month <=3; month++) {
			int payment = (int) (amount * 0.10);
				remaining = amount - payment;
				amount = remaining;
		}System.out.println(remaining);
	
	
	}
}
