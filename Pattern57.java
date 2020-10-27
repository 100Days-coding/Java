package Patterns5;
public class Pattern57 {
	public static void main(String[] args) {
	int n = 9;
	int x = 5;
	for(int i =1; i<= n; i++) // i=1,2,3,4,5..9 rows
	{
		for(int j=1; j<=n;j++) // j=1,2,3,4,5,6,7,8,9 cols
		{
			if( j == x || j == n-x+1)   // i=5
				// j == 2	|| j == 9-2+1 = 8		
			 System.out.print("*"); // *
			else
			 System.out.print(" ");
		}		
		System.out.println();
		
		if( i <= n/2)  // 5 <= 9/2 = 4 -> f
			x=x-1; // x = 5-1 = 4,3,2,1
		else // i = 5
			x=x+1; // x= 2,3,4,5
	}
} }
