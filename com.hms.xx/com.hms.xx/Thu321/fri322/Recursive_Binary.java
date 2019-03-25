package fri322;

import java.util.Arrays;
import java.util.Scanner;

public class Recursive_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sz = {40,17,39,89,100,1,57,61,78,65,15,41,60,49,56};
		for(int a1=0;a1<sz.length-1;a1++) {
			//对混乱数组的元素进行排序
			int minimum = sz[a1];
			int minxb = a1;
			for(int b=a1+1;b<sz.length;b++) {
				if(minimum>sz[b]) {
					minimum=sz[b];
					minxb=b;
					//记录最小数
				}
			}
			if(minxb!=a1) {
				sz[minxb]=sz[a1];
				sz[a1]=minimum;
				//最小数小标不等于本数时并进行互换
			}
		}
		System.out.println(Arrays.toString(sz));
//**********************************************************************************
		int low = 0;
		int high = sz.length-1;
		Scanner in = new Scanner(System.in);
		System.out.print("需要查询什么:");
		int cxs = in.nextInt();
		int a =recb(sz,low,high,cxs);
		System.out.println("\n查询数位置为数组第 "+(a+1)+" 个");
	}

	private static  int recb(int[] a, int low, int high,int cxs) {
		// TODO Auto-generated method stub
		if(low>high) 
			return -low-1;
		int mid = (low + high)/2;
		if(cxs>a[mid]) {
			return recb(a,mid+1,high,cxs);
		}else if(cxs<a[mid]) {
			return recb(a,low,mid-1,cxs);
		}else
		return mid;
	}

}
