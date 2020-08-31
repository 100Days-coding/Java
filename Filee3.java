package Pack1;
import java.io.*;
public class Filee3 
{
	public static void main(String[] args)
	throws Exception
	{
	  File f = new File("e:\\File1.txt");
	  FileReader fr = new FileReader(f);
	  char[] ch = new char[20];
	  fr.read(ch);
	  for (char c1:ch)
	  { System.out.print(c1); }
	}
}
