/**
 * @Title: Main.java
 * @Package dp.observer.v5
 * @Description: TODO
 * @author Deicide
 * @date 2019年7月14日 下午11:16:04
 * @version V1.0
 * @Copyright: 2019 Deicide. All rights reserved.
 */
package dp.observer.v5;

import java.util.ArrayList;
import java.util.List;

/*
 * 加入多个观察者与被观察者 类似vb.net 事件驱动
 */
class Child
{
	private boolean cry = false;
	private List<Observer> observers = new ArrayList<>( );
	{
		observers.add(new Dad( ));
		observers.add(new Mum( ));
		observers.add(new Dog( ));
	}

	public boolean isCry( )
	{
		return cry;
	}

	public void wakeUp( )
	{
		cry = true;
		for (Observer o : observers)
		{
			o.actionOnWakeUp( );
		}
	}
}

interface Observer
{
	void actionOnWakeUp( );
}

class Dad implements Observer
{
	public void feed( )
	{
		System.out.println("dad feeding...");
	}

	@Override
	public void actionOnWakeUp( )
	{
		feed( );
	}
}

class Mum implements Observer
{
	public void hug( )
	{
		System.out.println("dad feeding...");
	}

	@Override
	public void actionOnWakeUp( )
	{
		hug( );
	}
}


class Dog implements Observer
{
	public void wang( )
	{
		System.out.println("dad feeding...");
	}

	@Override
	public void actionOnWakeUp( )
	{
		wang( );
	}
}
/** 
* @ClassName: Main 
* @Description: TODO
* @author Deicide
* @date 2019年7月14日 下午11:16:04 
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
