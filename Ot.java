import java.util.*;
class Fathe
{
public void call()
{
	System.out.println("Call");
}
}
class Chill extends Fathe
{
	public void debit()
	{
		
		System.out.println("debit");		
	}

	}
	class Ot
	{
		public static void main(String s[])
		{
			Fathe f=new Chill();
			f.call();//gets successfully called as obvious
			 f.debit();//wont get called (compilation error)because we cant call method of class using 
			 //   the ref variable of another class.f is a reference variable of Fathe class but contains reference vaiable of 
			 // Chill class.
		}
	}

