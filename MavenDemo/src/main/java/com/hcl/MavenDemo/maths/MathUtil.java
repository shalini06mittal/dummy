package com.hcl.MavenDemo.maths;

public class MathUtil {
	
	public static int  factorial(int n)
	{
		int f = 1;
		for(int i=1;i<=n;i++)
			f*=i;
		return f;
	}

}
