package myexercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class wd_printwriter_lx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File wj = new File("G:\\编程\\com.hms.xx\\src\\myexercise\\我的这个文件声明.txt");
		if(wj.exists()&&wj.canRead()&&wj.canWrite()) {
			System.out.println("文件存在且能正常读写！");
		}else
			System.exit(0);
			
		try (PrintWriter wdsr = new PrintWriter(wj);) {
			wdsr.print("GUJIAN");
			wdsr.print(" "+100+" ");
			wdsr.println("级");
			wdsr.print("基佬城");
			wdsr.print(" "+99+" ");
			wdsr.println("级");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
