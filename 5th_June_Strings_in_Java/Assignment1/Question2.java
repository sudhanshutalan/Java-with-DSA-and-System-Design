//2.Write a java program to know whether the given string is palindrome
import java.util.*;

public class Question2 {
	public static void main(String args[]) {
		String original, reverse = ""; 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome");
		original = in.nextLine();
        in.close();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("Entered string is a palindrome.");
		else
			System.out.println("Entered string isn't a palindrome.");
	}
    
}
