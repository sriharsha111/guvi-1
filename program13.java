/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,r,p,s;
		Scanner S=new Scanner(System.in);
		n=S.nextInt();
		p=0;
		s=n;
		while(n>0)
		{
			r=n%10;
			p=p*10+r;
			n=n/10;
		}
		if(p==s)
		System.out.println("yes");
		else
		System.out.println("no");// your code goes here
	}
}
