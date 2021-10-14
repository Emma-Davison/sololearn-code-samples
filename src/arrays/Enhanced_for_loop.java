/**
 * 
 */
package arrays;
import java.util.Scanner;

/**
 * @author raven
 *
 */
public class Enhanced_for_loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	       int size = scanner.nextInt(); // input the length of the array.
	       int[] sides = new int[size];  // create a new array of integers with the length set to the length of size. 
	       for (int i: sides) {
	           i = scanner.nextInt();
	           
	           System.out.println(i*i);
	       }
	       scanner.close();

	}

}
