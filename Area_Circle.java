package Pack1;
import java.util.*;
public class Area_Circle {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		//object creation or instantiation
System.out.println("enter radius value :");
float r = obj.nextFloat();
float a = 3.14f * r*r;
// double a = 3.14f * r*r;   // implicit conversion

int x = 20;
long l = x;   // implicit conversion

long n = 350;
int m = (int)n;     // explicit conversion

System.out.println("area of cicle = "+ a);
System.out.printf("%1.2f",a);
	}
}
