package com.check;

import java.util.Arrays;
import java.util.Random;

import com.sort.QuickSort;
import com.sort.selectSort;

/**
 * @ClassName: DataChecker
 * @Description: 排序算法对数器
 * @author Deicide
 * @date 2019年6月2日 下午8:21:56
 * 
 */
public class DataChecker
{
	/**
	 * @Title: ${generateRandomArray} 
	 * @Description: ${生成数组} 
	 * @param 
	 * @return 
	 * @throws
	 */
	static int[] generateRandomArray()
	{
		Random r = new Random();

		int[] arr = new int[10000];

		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = r.nextInt(10000);
		}
		return arr;
	}

	/**
	 * @Title: ${check} 
	 * @Description: ${排序检查} 
	 * @param 
	 * @return 
	 * @throws
	 */
	static void check()
	{
		int[] arr = generateRandomArray();
		int[] arr2 = new int[arr.length];
		System.arraycopy(arr, 0, arr2, 0, arr.length);

		Arrays.sort(arr);
		QuickSort.Sort(arr2,0,arr.length-1 );

		boolean same = true;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] != arr2[i])
				same = false;
		}

		System.out.println(same == true ? "right" : "wrong");
	}

	public static void main(String[] args)
	{
		check();
	}
}
