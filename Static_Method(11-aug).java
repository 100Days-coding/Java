package Pack1;
import java.util.*;
public class Static_Method {

	static int Add(int x, int y)
	{
		return (x+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner abc = new Scanner(System.in);
int a = abc.nextInt();
int b = abc.nextInt();
int c = Add(a,b);
System.out.println("sum = "+c);
	}
}
