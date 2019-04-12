/**
 * 
 */
package com.gujian.wed0410;

/**
 * @author Administrator
 *
 */
public class Multithreading1 {

	/**
	 * @param args
	 * @param a1 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bbb c = new bbb();
		//创建出方法
		ccccc a =new ccccc(c,"用户1");
		ccccc a2 =new ccccc(c,"用户2");
		ccccc a3 =new ccccc(c,"用户3");//5个对象使用一个方法此时为多线程 并发状态 多个使用者交替使用一个工具
		ccccc a4 =new ccccc(c,"用户4");
		ccccc a5 =new ccccc(c,"用户5");
		
		a.start();
		a2.start();
		a3.start();
		a4.start();
		a5.start();
		
	}

}
