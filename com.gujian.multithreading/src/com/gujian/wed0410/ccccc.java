package com.gujian.wed0410;

public class ccccc extends Thread {
	private bbb ac;//声明出方法的对象
	public ccccc(bbb ac, String string) {
		this.ac =ac;//为声明的对象赋予真实方法,但方法只有一个
		setName(string);//为线程命名
	}
	public void run() {
		ac.XHDY(getName(),getId(),getPriority());//调用赋值后的工具,并将线程名字,线程id,优先级一起传送给方法.
	}
}

