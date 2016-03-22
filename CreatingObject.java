import java.lang.reflect.*;

class Sec
{
	int data;
	Sec(int x)
	{
      this.data=x;
	}
}
class CreatingObject
{
	int y;
	public static void main(String s[])
	{
		CreatingObject i=new CreatingObject(10);
		System.out.println(i);
		System.out.println("member of CreatingObject"+" " +i.y);
	}
	CreatingObject(int z)
	{
      this.y=z;

		Sec s=new Sec(z);
		System.out.println(s.data);
		System.out.println(s);

	}
}
