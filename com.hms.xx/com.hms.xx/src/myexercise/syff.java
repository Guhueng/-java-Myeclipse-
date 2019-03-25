package myexercise;

import java.util.Arrays;
import java.util.Random;

public class syff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random sjs = new Random();
		int[]a = {1,2,2,45,45,6,3,7,0,6};
		for(int b = 0 ;b<a.length;b++) {
			for(int c = 0;c<a.length;c++) {
				if(b!=c&&a[b]==a[c]) {
						a[b]=sjs.nextInt(50);
						c=-1;
					
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

}
