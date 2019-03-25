package fri322;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = fac(9);
		System.out.println(a);
		int a1 = fib(50);
		System.out.println(a1);
	}

	private static int fib(int i) {
		// TODO Auto-generated method stub
		if(i==0)
		return 0;
		else if(i==1)
			return 1;
		else 
			return fib(i-1)+fib(i-2);
	}

	private static int fac(int i) {
		// TODO Auto-generated method stub
		if(i>0) {
		return i*fac(i-1);	
		}else
			return 1;
	
		
	}

}
