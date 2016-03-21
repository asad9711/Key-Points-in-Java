import java.util.*;
import java.lang.Math.*;
import java.io.*;
class ExceptionPoint
{
	public static void main(String s[])
	{
		ExceptionPoint m=new ExceptionPoint();
		m.first();
     System.out.println("normal flow");
	}
	void first()
	{
try{
	second();
}catch(Exception e)
{

	System.out.println("exception handled");
}
	}

	void second()throws IOException
	{
		third();
	}

	void third()throws IOException
	{
		throw new IOException("device error");//checked exception
	}
}
