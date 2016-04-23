import java.util.*;
class Parent
{
	// void show()
	// {
	// 	System.out.println("show from parent");
	// }
	static int x=3;
	static {
		System.out.println("static block of parent0");
	}
	
}
class Child
{
	public static void main(String s[])
	{
		System.out.println(Parent.x);
		new Child();
	}
	{
		System.out.println("init block");
	}
}