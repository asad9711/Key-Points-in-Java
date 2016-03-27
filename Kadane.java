import java.util.*;
class Kadane
{
	public static void main(String s[])  //KADANE'S ALGO
	{
		// int a[]=new int[]{1,4,2,-3,-5,2,-1,3,1,-3};//nice case
		int a[]=new int[10];//there may be multiple max contiguous subarray in an array

		Random r=new Random();
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt(10)-5;
			System.out.println(a[i]+" ");
		}
		int sum1=a[0];int start=0,end=0,temp=0;
		int sum2=a[0];
		for(int i=1;i<a.length;i++)
		{
			sum1=sum1+a[i];
			if(a[i]>sum1)
			{
				sum1=a[i];temp=i;
			}
			if(sum1>sum2)
			{
				sum2=sum1;end=i;start=temp;
			}
			System.out.println("<"+start+"  "+end+">");
		}
		System.out.println("max sum is "+sum2+"start at "+start+"and end at"+end);
	}
}