/**
 * @Title: ShellSort.java
 * @Package com.sort
 * @Description: 希尔排序
 * @author Deicide
 * @date 2019年6月10日 下午11:11:53
 * @version V1.0
 * @Copyright: 2019 Deicide. All rights reserved.
 */
package com.sort;

/** 
* @ClassName: ShellSort 
* @Description: 主函数
* @author Deicide
* @date 2019年6月10日 下午11:11:53 
*  
*/
public class ShellSort
{
	/**
	 * 
	* @Title: main 
	* @Description: TODO
	* @param @param args     
	* @return void   
	* @throws
	 */
	public static void main(String[ ] args)
	{
		int arr[] = { 9 , 6 , 11 , 3 , 5 , 12 , 8 , 7 , 10 , 15 , 14 , 4 , 1 , 13 , 2 };

		sort2(arr);

		InsertSort.Print(arr);
	}

	/**
	 * 
	* @Title: sort 
	* @Description: 希尔排序
	* @param @param arr     
	* @return void   
	* @throws
	 */
	static void sort(int arr[])
	{
		//间隔控制
		for (int gap = arr.length / 2 ; gap > 0 ; gap /= 2)
		{
			//插入排序 j--
			for (int i = gap ; i < arr.length ; i++)
			{
				for (int j = i ; j > gap - 1 ; j -= gap)
				{
					if (arr[ i ] < arr[ i - gap ])
						InsertSort.Swap(arr , j , j - gap);
				}
			}
		}
	}

	/**
	 * 
	* @Title: sort2 
	* @Description: Knuth序列 希尔排序
	* @param @param arr     
	* @return void   
	* @throws
	 */
	static void sort2(int arr[])
	{
		int h = 1;
		while (h < arr.length / 3)
		{
			h = h * 3 + 1;
		}
		for (int gap = h ; gap > 0 ; gap = (gap - 1) / 3)
		{
			for (int i = gap ; i < arr.length ; i++)
			{
				for (int j = i ; j > gap - 1 ; j -= gap)
				{
					if (arr[ j ] < arr[ j - gap ])
						InsertSort.Swap(arr , j , j - gap);
				}
			}
		}
	}
}
