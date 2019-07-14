/**
 * @Title: Main.java
 * @Package dp.observer.v4
 * @Description: TODO
 * @author Deicide
 * @date 2019年7月14日 下午11:10:50
 * @version V1.0
 * @Copyright: 2019 Deicide. All rights reserved.
 */
package dp.observer.v4;

/*
 * 加入多个观察者
 * 类似vb.net 事件驱动
 */
class Child
{
	private boolean cry = false;

	private Dad dad = new Dad( );
	private Mum mum = new Mum( );
	private Dog dog = new Dog( );

	public boolean isCry( )
	{
		return cry;
	}

	public void wakeUp( )
	{
		cry = true;
		// 调用观察者处理
		dad.feed( );
		mum.hug( );
		dog.wang( );
	}
}

class Dad
{
	public void feed( )
	{
		System.out.println("dad feeding...");
	}
}

class Mum
{
	public void hug( )
	{
		System.out.println("dad hugging...");
	}
}

class Dog
{
	public void wang( )
	{
		System.out.println("dad wang...");
	}
}

/** 
* @ClassName: Main 
* @Description: TODO
* @author Deicide
* @date 2019年7月14日 下午11:10:50 
*  
*/
public class Main
{
	public static void main(String[ ] args)
	{
		Child child = new Child( );
		// do sth
		child.wakeUp( );
	}
}
