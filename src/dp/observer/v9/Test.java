/**
 * @Title: Test.java
 * @Package dp.observer.v9
 * @Description: TODO
 * @author Deicide
 * @date 2019年7月15日 下午11:27:15
 * @version V1.0
 * @Copyright: 2019 Deicide. All rights reserved.
 */
package dp.observer.v9;

import java.util.ArrayList;
import java.util.List;

/** 
* @ClassName: Test 
* @Description: TODO
* @author Deicide
* @date 2019年7月15日 下午11:27:15 
*  
*/
public class Test
{
	public static void main(String[ ] args)
	{
		Button b = new Button( );
		b.addActionListener(new MyActionListener( ));
		b.addActionListener(new MyActionListener2( ));
		b.buttonPressed( );
	}
}

class MyActionListener implements ActionListener
{// observer

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		System.out.println("button1");

	}

}

class MyActionListener2 implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		System.out.println("button2");

	}

}

class Button
{
	private List<ActionListener> actionListeners = new ArrayList<ActionListener>( );

	public void buttonPressed( )
	{
		ActionEvent e = new ActionEvent(System.currentTimeMillis( ) , this);
		for (int i = 0 ; i < actionListeners.size( ) ; i++)
		{
			ActionListener l = actionListeners.get(i);
			l.actionPerformed(e);
		}
	}

	public void addActionListener(ActionListener l)
	{
		actionListeners.add(l);
	}
}

interface ActionListener
{
	public void actionPerformed(ActionEvent e);
}

class ActionEvent
{
	long when;
	Object source;

	public ActionEvent(long when , Object source)
	{
		super( );
		this.when = when;
		this.source = source;
	}

	public long getWhen( )
	{
		return when;
	}

	public Object getSource( )
	{
		return source;
	}
}