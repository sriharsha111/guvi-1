/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int p,q,n,m;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		p=n+1;
		q=m-1;
		for(p=n+1;p<=q;p++)
		{
			if(p%2==0)
			System.out.println("\t"+p);
		}
	}
}
