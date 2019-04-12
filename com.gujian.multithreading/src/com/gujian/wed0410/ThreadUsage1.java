/**
 * 
 */
package com.gujian.wed0410;

/**
 * @author 黄茂嵩
 *errrrrr
 *
 */
public class ThreadUsage1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		ManufacturingPlant gc = new ManufacturingPlant(a);
		gc.start();
		Customer gk1 = new Customer(gc,"刘峰",a,2,2);
		Customer gk2 = new Customer(gc,"刘芳",a,4,3);
		Customer gk3 = new Customer(gc,"li菲",a,6,0);
		Customer gk4 = new Customer(gc,"刘飞",a,1,1);
		Customer gk5 = new Customer(gc,"天梭",a,3,1);
		gk1.start();
		gk2.start();
		gk3.start();
		gk4.start();
		gk5.start();
	}

}
