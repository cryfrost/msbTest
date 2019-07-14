/**
 * @Title: Main.java
 * @Package dp.observer.v2
 * @Description: TODO
 * @author Deicide
 * @date 2019年7月14日 下午10:49:22
 * @version V1.0
 * @Copyright: 2019 Deicide. All rights reserved.
 */
package dp.observer.v2;

/*
 * 面向对象的傻等
 */
class Child
{
	private boolean cry = false;

	public boolean isCry( )
	{
		return cry;
	}

	public void wakeUp( )
	{
		System.out.println("Waked  Up! Cryong ......");
		cry = true;
	}
}

/** 
* @ClassName: Main 
* @Description: TODO
* @author Deicide
* @date 2019年7月14日 下午10:49:22 
*  
*/
public class Main
{
public static void main(String[] args) {
	Child child=new Child();
	while(!child.isCry( )) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace( );
		}
		System.out.println("observering...");
	}
}
}
