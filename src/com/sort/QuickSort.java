/**
 * @Title: QuickSort.java
 * @Package com.sort
 * @Description: TODO
 * @author Deicide
 * @date 2019年6月18日 下午10:31:24
 * @version V1.0
 * @Copyright: 2019 Deicide. All rights reserved.
 */
package com.sort;

/** 
* @ClassName: QuickSort 
* @Description: TODO
* @author Deicide
* @date 2019年6月18日 下午10:31:24 
*  
*/
public class QuickSort
{
	public static void main(String[ ] args)
	{
		int arr[] = { 9 , 6 , 11 , 3 , 5 , 12 , 8 , 7 , 10 , 15 , 14 , 4 , 1 , 13 , 2 };
		InsertSort.Print(arr);
		System.out.println("");
		Sort(arr , 0 , arr.length - 1);
		InsertSort.Print(arr);
	}

	/**
	 * 
	* @Title: Sort 
	* @Description: TODO
	* @param @param arr
	* @param @param leftBound
	* @param @param rightBound     
	* @return void   
	* @throws
	 */
	public static void Sort(int[ ] arr , int leftBound , int rightBound)
	{
		if (leftBound >= rightBound)
			return;
		int mid=partition(arr , leftBound , rightBound);
		Sort(arr,leftBound,mid-1);
		Sort(arr,mid+1,rightBound);
	}

	/**
	 * 
	* @Title: partition 
	* @Description: TODO
	* @param @param arr
	* @param @param leftBound
	* @param @param rightBound     
	* @return void   
	* @throws
	 */
	static int partition(int[ ] arr , int leftBound , int rightBound)
	{
		int pivot = arr[ rightBound ];
		int left = leftBound;
		int right = rightBound - 1;

		while (left <=right)
		{
			while (left <=right&&arr[ left ] <= pivot)
				left++;
			while (left <=right&&arr[ right ] >pivot)
				right--;
//			System.out.print("left  " + left + "   right  " + right + "   arr:");
//			InsertSort.Print(arr);
//			System.out.println("");
			if (left < right)
				InsertSort.Swap(arr , left , right);
		}
		//if(pivot<arr[left]) Swap
		InsertSort.Swap(arr , left , rightBound);
		return left;
	}
}
