package objects;
import java.util.Scanner;

public class ClassAttributes {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
	    String firstName = read.nextLine();
	    String secondName = read.nextLine();
	    int age = read.nextInt();
	    int roomNumber = read.nextInt();
	    read.close();
	    Customer customer = new Customer();
	    //set customer's data to object here
	    customer.firstName = firstName;
		customer.secondName = secondName;
		customer.age = age;  
		customer.roomNumber = roomNumber;
		customer.saveCustomerInfo();
		
	}
}

class Customer{
	String firstName;
	String secondName;
	int age;
	int roomNumber;



//add all necessary attributes here
	


public void saveCustomerInfo() {
   
    System.out.println("First name: " + firstName);
    System.out.println("Second name: " + secondName);
    System.out.println("Age: " + age);
    System.out.println("Room number: " + roomNumber);
}
}

