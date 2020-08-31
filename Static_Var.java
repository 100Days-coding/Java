package Pack1;
public class Static_Var 
{
      int x =10;
	public static void main(String[] args) 
	{
	   Static_Var t1 = new Static_Var();
	   t1.x=50;
	   System.out.println(t1.x);  //50
	   
	   Static_Var t2 = new Static_Var();
	   System.out.println(t2.x);  //10  
	}
}
