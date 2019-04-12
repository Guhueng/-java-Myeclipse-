package com.gujian.wed0410;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class bbb{
	private Lock lock= new ReentrantLock();//lock锁
	void  XHDY(String xcm, long id, int yxj) {
		lock.lock();//线程被锁其他线程无法使用
		// TODO Auto-generated method stub
		for(int a=0;a<10;a++) {
			System.out.println(a+ "  优先级:"+yxj+" | 线程id:"+id +" | 线程名:"+ xcm );
		}
		lock.unlock();//锁打开工具释放其他对象可以使用
	}
	
}
