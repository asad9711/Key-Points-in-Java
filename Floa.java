class Floa
{
	public static void main(String s[])
	{
		float arr[]=new float[]{0.8934,0.4543,0.545};//THIS IS THE WRONG WAY 
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}



	public static void main(String s[])
	{
		float arr[]=new float[]{0.8934f,0.454f,0.545f};//RIGHT WAY BECAUSE IN JAVA FLOATING POINT NUMBERS
		                                               // ARE CONSIDERED AS "double".AND INTEGRALS ARE CONSIDERED AS INTEGERS.
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}