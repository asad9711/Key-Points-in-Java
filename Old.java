class New
{
	{
	 System.out.println("init of parent");
	}
	New()
	{
		System.out.println("cons of parent");
	}

}
class Old extends New
{
	{
		System.out.println("init of child");
	}
	Old()
	{
		System.out.println("cons of child");//first constructor of parent gets called and then init block of child and then
		                                    // constructor of child 
	}
	public static void main(String s[])
	{
      new Old();
	}
}