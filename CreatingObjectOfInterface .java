
interface At
{
	public void read();
}
class CreatingObjectOfInterface 
{
	public static void main(String s[])
	{
		At a=new At(){              //creating object(anonymous) of interface At
			public void read()
			{
				System.out.println("read");
			}
		};
		a.read();
	}
}


