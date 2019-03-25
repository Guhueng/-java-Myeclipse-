package fri322;

import java.util.Arrays;

public class No1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///////////////////删除数组元素/////////////////////
		int [] a = {12,32,41,51,61,1,72,12,461,};
		System.out.println(Arrays.toString(a));
		int xz = 2;
		for(int tz=xz;tz<a.length-1;tz++) {
			a[tz]=a[tz+1];
		}
		a[a.length-1]=0;
		System.out.println(Arrays.toString(a));
		System.out.println("////////////////////////////////////////////////////////////");
		//////////////////////////////////Arrays使用///////////////////////////////////////////
		int [] a1 = {12,32,41,51,61,1,72,112,46,};
		System.out.println(Arrays.toString(a1));
		Arrays.sort(a1);
		int cxs = 12;//查询数
		System.out.println(Arrays.toString(a1));
		System.out.println("查询数下标排行第二："+(Arrays.binarySearch(a1, cxs)+1));
		System.out.println(Arrays.toString(a1));
		System.out.println("--------------------------------------------------------------");
		///////////////////////遍历2维数组//////////////////////////////////////////////////////
		int [][] a2 = {{12,32,41,5,1,1,2,12,1,},{12,123,4512,515,6161,717}};
		System.out.println(Arrays.toString(a2[0]));
		System.out.println(Arrays.toString(a2[1]));
		System.out.println("遍历方法2");
		for(int c=0;c<a2.length;c++) {
			for(int c1=0;c1<a2[c].length;c1++) {
				System.out.print(a2[c][c1]+" ");
			}
		}
		
		System.out.println("\n---------*--------------/*------------*---------------------");
		///////////////////////////可变长度参数////////////////////////////////////////////
		kbcd(1,2,21,312,3,124,1,4,12);
		System.out.println("第二数");
		kbcd(12,12312,41412,1212,2412);
	}

	private static void kbcd(int ... a) {
		// TODO Auto-generated method stub
		int h=0;
		for(int c:a) {	
			h+=c;
		}
		System.out.println(h);
	}

}
