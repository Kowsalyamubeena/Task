package com.junit;

public class MaxNumber {
	
	public int findMax(int[] b)
	{
		int max=b[0];
		for(int i=0;i<b.length;i++)
			if(max<b[i])
			{
				max=b[i];
			}
		return max;
	}

}
