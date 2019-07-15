/**
 * @Title: Main.java
 * @Package dp.observer.v8
 * @Description: TODO
 * @author Deicide
 * @date 2019年7月15日 下午10:57:27
 * @version V1.0
 * @Copyright: 2019 Deicide. All rights reserved.
 */
package dp.observer.v8;

import java.util.ArrayList;
import java.util.List;

/*
 * 加入多个观察者与被观察者 类似vb.net 事件驱动 大多数时候，我们处理事件时，需要事件源对象 事件也可以形成继承体系
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
		wakeUpEvent event = new wakeUpEvent(System.currentTimeMillis( ) , "bed");
		for (Observer o : observers)
		{
			o.actionOnWakeUp(event);
		}
	}
}

abstract class Event<T>
{
	abstract T getSource( );
}

// 事件类 fire Event
class wakeUpEvent extends Event<Child>
{
	long timestamp;
	String loc;
	Child source;

	public wakeUpEvent(long timestamp , String loc)
	{
		this.timestamp = timestamp;
		this.loc = loc;
		this.source = source;
	}

	/*
	 * (非 Javadoc) <p>Title: getSource</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see dp.observer.v8.Event#getSource()
	 */
	@Override
	Child getSource( )
	{
		return source;
	}
}

interface Observer
{
	void actionOnWakeUp(wakeUpEvent event);
}

class Dad implements Observer
{
	public void feed( )
	{
		System.out.println("dad feeding...");
	}

	@Override
	public void actionOnWakeUp(wakeUpEvent event)
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
	public void actionOnWakeUp(wakeUpEvent event)
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
	public void actionOnWakeUp(wakeUpEvent event)
	{
		wang( );
	}
}

/** 
* @ClassName: Main 
* @Description: TODO
* @author Deicide
* @date 2019年7月15日 下午10:57:27 
*  
*/
public class Main
{

}
