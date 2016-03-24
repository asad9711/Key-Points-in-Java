class Arr
{
	public static void main(String s[])
	{
		int a[][]={
			{1,2,3},
			{4,5,6,7},
			{2,3,4,5,6}
		};
		    // In java a 2d array is a jagged array i.e it's not compulsory to all the rows be of same length.

		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			 System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}