package methodstopractice;

public class sueibianlianlian {
private static void jiafa(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("a+b="+(a+b));
	}
private static void jiafa(double c, int d) {
		// TODO Auto-generated method stub
		System.out.println("c+d="+(c+d));
	}
private static void szdyy(int[] dd) {
		// TODO Auto-generated method stub
		int cc=0;
		double a=dd.length;
		for(int v=0;v<dd.length;v++) {
			cc+=dd[v];
		}
		System.out.println("总数="+cc);
		System.out.println("平均数="+(cc/a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/////////////方法的重载////////////////////////
		int a=123;
		int b = 321;
		jiafa(a,b);
		double c=12.1;
		int d = 12;
		jiafa(c,d);
		//////////////数组的应用////////////////////
		int[]dd= {1,2,3,4,5,6,7,8,9,0};
		szdyy(dd);
		
	}
	
	
	

	

}
