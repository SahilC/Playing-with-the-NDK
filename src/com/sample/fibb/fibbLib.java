package com.sample.fibb;
public class fibbLib {
	public static long javaN(int n)
	{
		if(n==0 || n==1)
			return 0;
		else 
			return javaN(n-1)+javaN(n-2);
	}
	static
	{
		System.loadLibrary("fibb");
	}
	public static native long fibbN(int n);
}
