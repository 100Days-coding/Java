package Prgs6;
import java.util.*;
public class Automorphic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt(); // n = 76
		int x = 0;
		
		int sq = n*n; // sq = 5776
		
		while(n>0)  // 0 > 0 -> false
		{
			//if last digits not matching , condition is true
			if(n%10 != sq%10)  // 7%10= 7  != 577%10= 7 -> false
			{
				x = 1;
				break;
			}
			// to check other last digits
			n= n/10; //  n= 7/10 = 0
			sq = sq/10; // 577 /10 = 57
		}
		if(x==0) // 0==0 -> true
			System.out.println("Automorphic Number");
		else
			System.out.println("Not Automorphic Number");
	} }
