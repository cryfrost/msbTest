/**
 * @Title: CountSortTest.java
 * @Package Test
 * @Description: TODO
 * @author Deicide
 * @date 2019年7月9日 下午10:47:18
 * @version V1.0
 * @Copyright: 2019 Deicide. All rights reserved.
 */
package Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;

import com.sort.CountSort;

/** 
* @ClassName: CountSortTest 
* @Description: TODO
* @author Deicide
* @date 2019年7月9日 下午10:47:18 
*  
*/
public class CountSortTest
{
	int[ ] generateRandomArray( )
	{
		Random r = new Random( );

		int[ ] arr = new int[10000];

		for (int i = 0 ; i < arr.length ; i++)
		{
			arr[ i ] = r.nextInt(10);
		}
		return arr;
	}
	
	@Test
	void testSort() {
		int[] a=generateRandomArray();
		int[] result = CountSort.sort(a);
		
		Arrays.sort(a);
		boolean same=true;
		for(int i=0;i<a.length ;i++) {
			if(result[i] != a[i]) same =false;
		}
		
		assertEquals(true,same);
	}
}
