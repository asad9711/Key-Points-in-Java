import java.util.*;
class Calling
{
	public static void main(String s[])
	{
		// String str="abcdef";
		Scanner sc=new Scanner(System.in);//Since we cant mutate String class so why not 
		                               // convert it to StringBuffer class and mutate it
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		int j=sb.length()-1;char temp='a';char temp2='a';
		System.out.println(sb.length());
		try{
		if(sb.length()%2==0)
		{
			
		   for(int i=0;i<sb.length()/2;i++)
		   { 
            temp=sb.charAt(i);
            temp2=sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp);
            j--;
		   }
		}
		else
		{
          for(int i=0;i<(sb.length()/2);i++)
		   { 
            temp=sb.charAt(i);
            temp2=sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp);
            j--; 
		   }
		}
	}catch(Exception e)
	{
		System.out.println(e);
	}
		System.out.println(sb);
	}

	}

