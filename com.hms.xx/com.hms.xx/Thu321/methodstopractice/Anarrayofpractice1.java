package methodstopractice;
import java.util.Scanner;
public class Anarrayofpractice1 {

	private static void cz(int[]sz,int cxs) {
		// TODO Auto-generated method stub
		int high = sz.length-1;
		int low = 0;
		while(high>=low) {
			int mid = (low+high)/2;//保证中间数永远在中心
			if(cxs==sz[mid]) {
				System.out.println("查询数在下标"+mid+"的位置");
				return;
			}else if(cxs>sz[mid]) {
				low=mid+1;//如果在中间之前就把最大数变成中间+1
			}else 
				high=mid-1;//如果在中间之前那就把最大数变成中间-1
		}
		System.out.println("数不存在");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int [] sz = new int[] {6,3,9,9,45,23,2,1,324,100,60};
		for(int a=0;a<sz.length-1;a++) {
			//对混乱数组的元素进行排序
			int minimum = sz[a];
			int minxb = a;
			for(int b=a+1;b<sz.length;b++) {
				if(minimum>sz[b]) {
					minimum=sz[b];
					minxb=b;
					//记录最小数
				}
			}
			if(minxb!=a) {
				sz[minxb]=sz[a];
				sz[a]=minimum;
				//最小数小标不等于本数时并进行互换
			}
		}
		for(int x=0;x<sz.length;x++) {
			System.out.print(sz[x]+" ");
		}
		System.out.println("输入需要查找的数：");
		int cxs = in.nextInt();
		cz(sz,cxs);
		in.close();
	}
}
