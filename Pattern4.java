package Patterns;
public class Pattern4 {
	public static void main(String[] args) {
		for(int i = 'A'; i<='E';i++) // 5 rows, i = 5
		{
			for(int j='A'; j<=i;j++) // 5 cols
			{
				System.out.print((char)i +" "); //1 2 3 4 5
				
			}
			System.out.println();
		}
	} }

