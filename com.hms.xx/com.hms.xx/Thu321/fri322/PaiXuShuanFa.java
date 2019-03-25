package fri322;

import java.util.Arrays;

public class PaiXuShuanFa {
	private static void extracted(int[] a) {//选择排序
		for(int c = 0;c<a.length-1;c++) {
			int min = a[c];//记录最小数
			int mindexb = c;//记录最小数下标
			for(int b = c+1;b<a.length-1;b++) {
				if(a[c]>a[b]) {
					min = a[b];//保存比a[c]小的数
					mindexb = b;//保持其下标
				}
			}
			a[mindexb]=a[c];//换位
			a[c]=min;//给a[c]赋值
		}
	}
/////////////////////////////////////////////////////////////////////////////////////
	private static void extracted2(int[] a) {//冒泡排序
		boolean tc = true;
		for (int k = 1; k < a.length - 1 && tc; k++) {
		    tc = false;
		    for (int c = 0; c < a.length - k; c++) {
		        if (a[c] > a[c + 1]) {
		            int jl = a[c];
		            a[c] = a[c + 1];
		            a[c + 1] = jl;
		            tc = true; 
		          
		        }
		    }System.out.println("--------------------");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       int[] a = {10, 10, 30, 40, 10, 100, 99, 60, 76};
		        //extracted(a);
		        extracted2(a);
		    System.out.print(Arrays.toString(a));
		    
	}
	

}
