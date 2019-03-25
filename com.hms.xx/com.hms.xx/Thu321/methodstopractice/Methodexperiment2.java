package methodstopractice;

import java.util.Scanner;

public class Methodexperiment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("请输入购买饮料的资金：");
		int fy = in.nextInt();
		yljs(fy);
		in.close();
	}

	private static void yljs(int fy) {
		// TODO Auto-generated method stub
		final int KL = 3;
		final int HN = 6;
		final int MD = 4;
		for (int a = 1; (a * KL) <= fy; a++) {
			for (int b = 0; (b * HN + a * KL) <= fy; b++) {
				for (int c = 0; (b * HN + a * KL + c * MD) <= fy; c++)
					if (a * KL + b * HN + MD * c == fy) {
						System.out.println("能买" + a + "瓶可乐" + b + "瓶红牛" + c + "瓶脉动");
					}
			}
		}
	}
}
