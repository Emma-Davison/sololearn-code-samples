package loops;
import java.util.Scanner;

public class Loops {
	public static void main(String[] agrs) {
		Scanner read = new Scanner(System.in);
		int number = read.nextInt();
	    int start = 1;
	    
		while (start <= number) {
			if (start % 3 == 0 || start % 10 == 3) 
				System.out.println(start);
			start++;
		
		}
		read.close();
	} 
	
}	


