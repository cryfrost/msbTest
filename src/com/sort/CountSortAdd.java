/**
 * @Title: CountSortAdd.java
 * @Package com.sort
 * @Description: TODO
 * @author Deicide
 * @date 2019年7月11日 下午10:25:55
 * @version V1.0
 * @Copyright: 2019 Deicide. All rights reserved.
 */
package com.sort;

import java.util.Arrays;

/** 
* @ClassName: CountSortAdd 
* @Description: TODO
* @author Deicide
* @date 2019年7月11日 下午10:25:55 
*  
*/
public class CountSortAdd
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

		/*累计数组*/
		for (int i = 1 ; i < count.length ; i++)
		{
			count[ i ] = count[ i ] + count[ i - 1 ];
		}

		System.out.println(Arrays.toString(count));

		for (int i = arr.length - 1 ; i >= 0 ; i--)
		{
			result[ --count[ arr[ i ] ] ] = arr[ i ];
		}

		return result;
	}
}
