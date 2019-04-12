/**
 * 
 */
package com.gujian.wed0410;

/**
 * @author 黄茂嵩
 *我的带顾客们
 */
public class Customer extends Thread {
	ManufacturingPlant gc;
	Object tb;
	int xq1;
	int xq2;
	public Customer( ManufacturingPlant gc,String name,int a,int xq1,int xq2) {
		setName(name);
		this.gc = gc;
		tb = a;
		this.xq1 = xq1;
		this.xq2 = xq2;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//synchronized(tb) {
			while(true) {
				gc.setKc1(gc.getKc1()-xq1);
				gc.setKc2(gc.getKc2()-xq2);
				System.out.print("剩余白馍"+gc.getKc1());
				System.out.print("剩余摊饼"+gc.getKc2());
				System.out.print("  客户名字:"+getName()+"\n");
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		//}
	}
	
	
}
