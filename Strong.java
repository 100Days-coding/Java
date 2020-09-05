package Prgs5;
import java.util.*;
public class Strong {
	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		System.out.println("enter number :");
		int n = obj.nextInt(); // 145
		int temp = n;  // temp =145	
		int sum = 0;
		while(n != 0) // this loop is to identify each digit, 0 != 0 -> f 
		{
			int fact = 1;
			int i = 1;
			int rem = n%10;   // rem = 1%10 = 1
		   // below loop is for each digit factorial	
			while(i <= rem) // 2 <= 1 -> false
			{
				fact = fact * i; // fact =  1 
				i++; // i = 2
			}
			 sum = sum + fact ; // sum = 144 + 1 = 145
			n = n/10;  // n = 1/10 = 0
		}
         if ( sum == temp) // 145 = 145 -> true
        	 System.out.println(temp + " is a Strong Number" );
         else
        	System.out.println(temp + " is not a Strong Number"); 
} }
