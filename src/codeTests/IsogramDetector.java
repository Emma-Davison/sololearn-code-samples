package codeTests;
import java.util.Arrays;
import java.util.Scanner;

public class IsogramDetector {
	
	public static void sortString (String word, char[] newWord) {
		
		char[] arrToSort = word.toCharArray();
		
		Arrays.sort(arrToSort);
		
		System.out.println("The sorted version of " + word + " is: " + arrToSort.toString());
		
		for(int i = 0; i < arrToSort.length; i++) {
			newWord[i] = arrToSort[i];
			System.out.println(newWord[i]);
			
		
	}
	}
	/*public static void Isogram_Detector(String word, char[] newWord) {
		for(int i = 0; i < word.length(); i++) {
			newWord[i] = word.charAt(i);
			System.out.println(newWord[i]);
			if (word.charAt(i) == word.charAt(i+1))
				System.out.println("This is not an isogram");
			else
				System.out.println("This is an isogram");
				
		}
		
	}*/
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		//String word = "geeksforgeeks";
		
		sc.close();
		
		//Isogram_Detector(word, newWord);
		
		
		
		
		}	
		
	}


