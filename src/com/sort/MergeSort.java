/**
 * @Title: MergeSort.java
 * @Package com.sort
 * @Description: TODO
 * @author Deicide
 * @date 2019年6月12日 下午10:56:24
 * @version V1.0
 * @Copyright: 2019 Deicide. All rights reserved.
 */
package com.sort;

/** 
* @ClassName: MergeSort 
* @Description: TODO
* @author Deicide
* @date 2019年6月12日 下午10:56:24 
*  
*/
public class MergeSort
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

		sort(arr , 0 , arr.length-1);

		InsertSort.Print(arr);
	}

	/**
	 * 
	* @Title: sort 
	* @Description: TODO
	* @param @param arr     
	* @return void   
	* @throws
	 */
	static void sort(int arr[] , int left , int right)
	{
		if (left == right)
			return;
		// 分成两部分
		int mid = left + (right - left) / 2;
		// 左边排序
		sort(arr , left , mid);
		// 右边排序
		sort(arr , mid + 1 , right);

		merge2(arr , left , mid + 1 , right);
	}

	/**
	 * 
	* @Title: merge 
	* @Description: TODO
	* @param @param arr     
	* @return void   
	* @throws
	 */
	static void merge(int arr[])
	{
		int mid = arr.length / 2;

		int[ ] temp = new int[arr.length];

		int i = 0 , k = 0;
		int j = mid + 1;
		while (i <= mid && j < arr.length)
		{
			// 优化：temp[k++]=arr[i]<=arr[j]?arr[i++]:arr[j++];
			if (arr[ i ] <= arr[ j ])
			{
				temp[ k++ ] = arr[ i++ ];
			}
			else
			{
				temp[ k++ ] = arr[ j++ ];
			}

		}
		while (i <= mid)
			temp[ k++ ] = arr[ i++ ];
		while (j < arr.length)
			temp[ k++ ] = arr[ j++ ];

		InsertSort.Print(temp);
	}

	/**
	 * 
	* @Title: merge2 
	* @Description: TODO
	* @param @param arr
	* @param @param leftPt 左侧起始位置
	* @param @param rightPtr 右侧起始位置
	* @param @param rightBound 有边界    
	* @return void   
	* @throws
	 */
	static void merge2(int arr[] , int leftPtr , int rightPtr , int rightBound)
	{
		int mid = rightPtr - 1;

		int[ ] temp = new int[rightBound - leftPtr + 1];

		int i = leftPtr;
		int j = rightPtr;
		int k = 0;

		while (i <= mid && j <= rightBound)
		{
			temp[ k++ ] = arr[ i ] <= arr[ j ] ? arr[ i++ ] : arr[ j++ ];
		}
		while (i <= mid)
			temp[ k++ ] = arr[ i++ ];
		while (j <= rightBound)
			temp[ k++ ] = arr[ j++ ];

		for (int m = 0 ; m < temp.length ; m++)
		{
			arr[ leftPtr + m ] = temp[ m ];
		}
	}

}
