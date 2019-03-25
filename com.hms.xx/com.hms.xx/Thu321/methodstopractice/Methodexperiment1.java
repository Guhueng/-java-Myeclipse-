package methodstopractice;

import java.util.Scanner;

public class Methodexperiment1 {
	private static void ff(int a) {
		// TODO Auto-generated method stub
		if (a > 0) {
			System.out.println("是正数");
		} else
			System.out.println("是负数");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		ff(a);
		in.close();
	}
}
