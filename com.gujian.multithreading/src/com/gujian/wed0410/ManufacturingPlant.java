/**
 * 
 */
package com.gujian.wed0410;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 我的大工厂.jpg
 * 
 * @author 黄茂嵩
 *
 */
public class ManufacturingPlant extends Thread {

	private int[] kc = {100,100};// 库存[0]白馍[1]摊饼

	Lock suo = new ReentrantLock();

	private int person;

	Object tb;

	/**
	 * @return the kc
	 */
	public int getKc1() {
		return kc[0];
	}
	public int getKc2() {
		return kc[1];
	}

	/**
	 * @param kc the kc to set
	 */
	public void setKc1(int kc) {
		this.kc[0] = kc;
	}
	public void setKc2(int kc) {
		this.kc[1] = kc;
	}

	public ManufacturingPlant() {
		person = 3;
	}

	public ManufacturingPlant(int a) {
		System.out.println("请输入新员工人数:");
		Scanner in = new Scanner(System.in);
		int c = in.nextInt();
		setPerson(c);
		tb = a;
		in.close();
	}

	/**
	 * @return 工厂人数
	 */
	public int getPerson() {
		return person;
	}

	/**
	 * @param 工厂工人人数设定
	 */
	public void setPerson(int person) {
		this.person = person;
	}

	// 生产开始
	@Override
	public void run() {
		//synchronized (tb) {
			while (true) {
				if (kc[0] < 200 || kc[1] < 200) {
					if (kc[0] < kc[1] - 20) {
						kc[0] += (3 * getPerson() + 10);
						kc[1] += (2 * getPerson() + 10);
					} else if (kc[0] > kc[1] + 20) {
						kc[0] += (2 * getPerson() + 10);
						kc[1] += (3 * getPerson() + 10);
					}
				}else if(kc[0]>400||kc[1]>400) {
					kc[0] += (2 * getPerson() );
					kc[1] += (2 * getPerson() );
				}
				else
				if (kc[0] > 1000 || kc[1] > 1000) {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		//}
	}

}
