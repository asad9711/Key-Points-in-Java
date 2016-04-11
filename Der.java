class Par
{
	private int x=10;
	void show()
	{
		System.out.println(x);
	}
}
class Der extends Par
{
	public static void main(String s[])
	{
		// Par p=new Par();

		Der p=new Der();
		p.show();//even x is private ,it can be accesed by calling show().Reason is quite clear.
		
	}
}