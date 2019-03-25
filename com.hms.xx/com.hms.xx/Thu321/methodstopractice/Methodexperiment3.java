package methodstopractice;

import java.util.Scanner;

public class Methodexperiment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 素数
		Scanner dqsr = new Scanner(System.in);
		System.out.print("需要判断的素数：");
		int shus = dqsr.nextInt();
		System.out.print("判断到什么之前的素数：");
		int zqs = dqsr.nextInt();
		qss(shus);
		zqss(zqs);
		dqsr.close();
	}

	private static void zqss(int zqs) {
		// TODO Auto-generated method stub
		
		for(int a=2;a<zqs;a++) {
			boolean bb = true;
			if(a%2==0&&a!=2) {
				bb=false;}
				for(int i=3;i<a;i+=2) {
					if(a%i==0) {
						bb=false;
						break;
					}
				}
			
			if(bb) {
				System.out.println("素数：");
				System.out.println(a);
			}
		}
	}	

	private static void qss(int a) {
		// TODO Auto-generated method stub
		boolean bb =true;
		if(a==2) {
			System.out.println("2是素数");
			return;
		}
			for(int i=2;i<Math.sqrt(a);i++) {
				if(a%i==0) {
				bb=false;	
				}
				if(bb) {
					System.out.println(a+"是素数");
					return;
				}else
					System.out.println(a+"不是素数");
				return;
			}
		}

}
