package loops;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  int number;
	       do {
	        //take input and output corresponding message
	        /*
	       1 => Language selection
	       2 => Customer support
	       3 => Check the balance e
	       4 => Check loan balance
	       0 => Exit
	       */
	            number = sc.nextInt();		
				switch(number) {
	                case 1:
	                    System.out.println("Ls");
	                    break;
	                case 2:
	                    System.out.println("CS");
	                    break;
	                case 3:
	                    System.out.println("CB");
	                    break;
	                case 4:
	                    System.out.println("CLB");
	                    break;
	            }// end of switch
	       }
	       while (number != 0); System.out.println("Exit");
	   }
			
	}  
	  
	
		
		
			
		
	
		
		
		




