/**   
* @Title: TestFrame.java 
* @Package dp.observer.v9 
* @Description: TODO
* @author Deicide    
* @date 2019年7月15日 下午11:27:46 
* @version V1.0   
 * @Copyright: 2019 Deicide. All rights reserved. 
*/
package dp.observer.v9;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/** 
* @ClassName: TestFrame 
* @Description: TODO
* @author Deicide
* @date 2019年7月15日 下午11:27:46 
*  
*/
public class TestFrame extends Frame
{
	public void launch() {
		Button b=new Button("press me");
		b.addActionListener(new MyActionListener());
		b.addActionListener(new MyActionListener2());
		this.add(b);
		this.pack();
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		this.setLocation(400 , 400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestFrame().launch();
	}
	
	private class MyActionListener implements ActionListener{//observer

		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			System.out.println("button1");
			
		}
		
	}
	
	private class MyActionListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			System.out.println("button2");
			
		}
		
	}
}
