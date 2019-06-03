package com.sort;

/**
 * @ClassName: selectSort
 * @Description: 选择排序算法
 * @author Deicide
 * @date 2019年6月2日 下午8:21:56
 * 
 */
public class selectSort
{
	/**
	 * @Title: ${main} 
	 * @Description: ${主函数} 
	 * @param 
	 * @return 
	 * @throws
	 */
	public static void main(String[] args)
	{
		int arr[] ={ 5, 3, 6, 8, 1, 7, 9, 2, 4 };

		for (int i = 0; i < arr.length - 1; i++)
		{
			int minPos = i;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[j] < arr[minPos])
				{
					minPos = j;
				}
				// minPos=arr[j]<arr[minPos]?j:minPos;
			}
			int temp = arr[i];
			arr[i] = arr[minPos];
			arr[minPos] = temp;

			System.out.println("minPds:" + minPos);
			for (int k = 0; k < arr.length; k++)
			{
				System.out.print(arr[k] + "  ");
			}
		}

	}

	/**
	 * @Title: ${sort} 
	 * @Description: ${选择排序} 
	 * @param ${int[] arr} 
	 * @return 
	 * @throws
	 */
	public static void sort(int[] arr)
	{
		for (int i = 0; i < arr.length - 1; i++)
		{
			int minPos = i;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[j] < arr[minPos])
				{
					minPos = j;
				}
				// minPos=arr[j]<arr[minPos]?j:minPos;
			}
			int temp = arr[i];
			arr[i] = arr[minPos];
			arr[minPos] = temp;
		}
	}
}
