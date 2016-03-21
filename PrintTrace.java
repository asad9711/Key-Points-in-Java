import java.io.*;
class PrintTrace
{
	public static void main(String s[])
	{
		try{
		new PrintTrace().first();
}catch(Exception e)
{
	e.printStackTrace();
	// System.out.println(e);
}
	}
	void first()throws IOException
	{
		throw new IOException("throwing exception");
	}
}