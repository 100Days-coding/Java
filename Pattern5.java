package Patterns;
public class Pattern5 {
	public static void main(String[] args) {
	for(int i= 1; i<=5;i++) // 5 rows
	{
		for(int j = 5  ; j >= i; j--)  // j=5,4,3,2,1
		{
			System.out.print(j+" "); // 5 
		}
		System.out.println();
	}
 } }
