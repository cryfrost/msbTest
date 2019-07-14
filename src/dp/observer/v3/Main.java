/**
 * @Title: Main.java
 * @Package dp.observer.v3
 * @Description: TODO
 * @author Deicide
 * @date 2019年7月14日 下午11:02:40
 * @version V1.0
 * @Copyright: 2019 Deicide. All rights reserved.
 */
package dp.observer.v3;

/*
 * 加入观察者
 */
class Child
{
	private boolean cry = false;

	private Dad dad=new Dad();
	
	public boolean isCry( )
	{
		return cry;
	}

	public void wakeUp( )
	{
		cry = true;
		//调用观察者处理
		dad.feed( );
	}
}

class Dad
{
	public void feed( )
	{
		System.out.println("dad feeding...");
	}
}

/** 
* @ClassName: Main 
* @Description: TODO
* @author Deicide
* @date 2019年7月14日 下午11:02:40 
*  
*/
public class Main
{
	public static void main(String[ ] args)
	{
		Child child = new Child( );
		//do sth
		child.wakeUp( );
	}
}
