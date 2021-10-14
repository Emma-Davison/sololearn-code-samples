package arrays;
import java.util.Scanner;

public class SumElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       int size = sc.nextInt(); //State the length of the array. 
	       int[] nums = new int[size];  // Set the length of the array nums to the var size.  
	       int sum = 0;
	       for (int i = 0; i < size; i++) {
	           nums[i] = sc.nextInt();

	       //your code goes here
	           
	           if (nums[i] % 4 == 0) {
	               sum += nums[i];
	       }
	       }System.out.println(sum);
	      sc.close();

	}

}
