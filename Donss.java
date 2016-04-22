class Conss
{
	Conss()
	{
		System.out.println("cons");//explictly calling constructor of parent class
	}
}
class Donss extends Conss
{
	Donss()
	{
    Conss c=new Conss();
		System.out.println("dons");
	}
	public static void main(String s[])
	{
		new Donss();
	}
}