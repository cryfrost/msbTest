/**
 * @Title: InsertSort.java
 * @Package com.sort
 * @Description: TODO
 * @author Deicide
 * @date 2019年6月4日 下午9:38:46
 * @version V1.0
 * @Copyright: 2019 Deicide. All rights reserved.
 */
package com.sort;

/** 
* @ClassName: InsertSort 
* @Description: TODO
* @author Deicide
* @date 2019年6月4日 下午9:38:46 
*  
*/
public class InsertSort
{
	/**
	* @Title: main 
	* @Description: 主方法
	* @param @param args     
	* @return void   
	* @throws
	 */
	public static void main(String[ ] args)
	{
		int a[] ={ 9 , 3 , 1 , 4 , 6 , 8 , 7 , 5 , 2 };
		sort3(a);
		Print(a);
	}

	/**
	 * 
	* @Title: sort 
	* @Description: 插入排序
	* @param @param a     
	* @return void   
	* @throws
	 */
	static void sort(int[ ] a)
	{
		for (int i = 1 ; i < a.length ; i++)
		{
			for (int j = i ; j > 0 ; j--)
			{
				if (a[ j ] < a[ j - 1 ])
					Swap(a , j , j - 1);
			}
		}
	}

	/**
	 * 
	* @Title: sort2 
	* @Description: 插入排序
	* @param @param a     
	* @return void   
	* @throws
	 */
	static void sort2(int[ ] a)
	{
		for (int i = 1 ; i < a.length ; i++)
		{
			for (int j = i ; j > 0 && a[ j ] < a[ j - 1 ] ; j--)
			{
				Swap(a , j , j - 1);

			}
		}
	}

	/**
	 * 
	* @Title: sort3
	* @Description: 插入排序 不用swap交换 数据后移，temp插到相应位置
	* @param @param a     
	* @return void   
	* @throws
	 */
	static void sort3(int[ ] a)
	{
		for (int i = 2 ; i <= a.length ; i++)
		{
			int temp = a[ i - 1 ];
			int j = i - 2;
			while (j >=0 && a[ j ] > temp)
			{
				a[ j + 1 ] = a[ j ];
				j--;
			}
			a[ j + 1 ] = temp;
		}
	}

	/**
	 * 
	* @Title: Swap 
	* @Description: 交换算法
	* @param @param a
	* @param @param i
	* @param @param j     
	* @return void   
	* @throws
	 */
	public static void Swap(int[ ] a , int i , int j)
	{
		int temp = a[ i ];
		a[ i ] = a[ j ];
		a[ j ] = temp;
	}

	/**
	 * 
	* @Title: Print 
	* @Description: 打印数组
	* @param @param a     
	* @return void   
	* @throws
	 */
	public static void Print(int[ ] a)
	{
		for (int i = a.length - 1 ; i > -1 ; i--)
		{
			System.out.print(a[ i ] + "  ");
		}
	}
}
