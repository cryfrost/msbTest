/**
 * @Title: BubbleSort.java
 * @Package com.sort
 * @Description: 冒泡排序
 * @author Deicide
 * @date 2019年6月3日 下午10:14:01
 * @version V1.0
 */
package com.sort;

/** 
* @ClassName: BubbleSort 
* @Description: 冒泡排序
* @author Deicide  
* @date 2019年6月3日 下午10:14:01 
*  
*/
public class BubbleSort
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
		 Sort(a);
		 Print(a);
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
	static void Swap(int[ ] a , int i , int j)
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
	static void Print(int[ ] a)
	{
		for (int i = a.length - 1 ; i >-1 ; i--)
		{
			System.out.print(a[ i ]+"  ");
		}
	}

	/**
	 * 
	* @Title: Sort 
	* @Description: 冒泡排序
	* @param @param a     
	* @return void   
	* @throws
	 */
	static void Sort(int[ ] a)
	{
		for (int i = a.length - 1 ; i > 0 ; i--)
		{
			for (int j = 0 ; j < i ; j++)
			{
				if (a[ j ] > a[ j + 1 ])
					Swap(a , j , j + 1);
			}
		}
	}

	/**
	 * 
	* @Title: findMax 
	* @Description: 找最大值
	* @param @param a
	* @param @param n     
	* @return void   
	* @throws
	 */
	static void findMax(int[ ] a , int n)
	{
		for (int j = 0 ; j < n ; j++)
		{
			if (a[ j ] > a[ j + 1 ])
				Swap(a , j , j + 1);
		}
	}

	/**
	 * 
	* @Title: Sort2 
	* @Description: 重写冒泡
	* @param @param a     
	* @return void   
	* @throws
	 */
	static void Sort2(int[ ] a)
	{
		for (int i = a.length - 1 ; i > 0 ; i--)
		{
			findMax(a , i);
		}
	}
}
