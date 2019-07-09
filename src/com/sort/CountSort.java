/**
 * @Title: CountSort.java
 * @Package com.sort
 * @Description: TODO
 * @author Deicide
 * @date 2019年7月9日 下午10:07:05
 * @version V1.0
 * @Copyright: 2019 Deicide. All rights reserved.
 */
package com.sort;

import java.util.Arrays;

/** 
* @ClassName: CountSort 
* @Description: TODO
* @author Deicide
* @date 2019年7月9日 下午10:07:05 
*  
*/
public class CountSort
{
	public static void main(String[ ] args)
	{
		int[ ] arr = { 2 , 4 , 2 , 3 , 7 , 1 , 1 , 0 , 0 , 5 , 6 , 9 , 8 , 5 , 7 , 4 , 0 , 9 };
		
		int[ ] result = sort(arr);
		
		System.out.println(Arrays.toString(result));
	}

	/**
	 * 
	* @Title: sort 
	* @Description: TODO
	* @param @param arr
	* @param @return     
	* @return int[]   
	* @throws
	 */
	public static int[ ] sort(int[ ] arr)
	{
		int[ ] result = new int[arr.length];

		/* 数组范围0-9 */
		int[ ] count = new int[10];
		
		for (int i = 0 ; i < arr.length ; i++)
		{
			count[ arr[ i ] ]++;
		}

		System.out.println(Arrays.toString(count));

		for (int i = 0 , j = 0 ; i < count.length ; i++)
		{
			while (count[ i ]-- > 0)
				result[ j++ ] = i;
		}
		return result;
	}

	/**
	 * 
	* @Title: finMax 
	* @Description: TODO
	* @param @param a
	* @param @param n     
	* @return void   
	* @throws
	 */
	static void finMax(int[ ] a , int n)
	{
		for (int j = 0 ; j < n ; j++)
		{
			if (a[ j ] > a[ j + 1 ])
				InsertSort.Swap(a , j , j + 1);
		}
	}
}
