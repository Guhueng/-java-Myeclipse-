package client_information_management;

import java.util.Scanner;

public class CustomerList extends Customer {
	Scanner in = new Scanner(System.in);
	Customer [] khgl ;
	int cd;
	int zdjl = 0;//目前数值内有多少元素
	public CustomerList(int totalCustomer) {
		khgl=new Customer[totalCustomer];
		int cd = khgl.length;
	}
	public boolean addCustomer(Customer customer) {
		boolean cc = false;
		khgl[zdjl] = customer;
		if(khgl[zdjl].getName()!=null&&khgl[zdjl].getGender()!=null&&khgl[zdjl].getAge()!=null&&
				khgl[zdjl].getPhone()!=null&&khgl[zdjl].getEmail()!=null) {
			cc=true;
			zdjl++;
		}
		return cc;
	}
	public boolean replaceCustomer(int index, Customer cust) {
		boolean cc = false;
		khgl[index] = cust;
		if(khgl[index].getName()!=null&&khgl[index].getGender()!=null&&khgl[index].getAge()!=null&&
				khgl[index].getPhone()!=null&&khgl[index].getEmail()!=null) {
			cc=true;
		}
		return cc;
		
	}
	public void deleteCustomer(int index) {
		System.out.println("你确定要删除吗?Y|N");
		String c = in.next();
		if(c=="y"||c=="Y") {
			for(int a=index;a<khgl.length-1;a++ ) {
				khgl[a]=khgl[a+1];
			}
		khgl[khgl.length-1]=null;
		zdjl--;
		}else
			if(c=="n"||c=="N") {
				System.out.println("以退出");
			}else
				System.out.println("输入错误,以退出");
		
	}
	public void getAllCustomers() {
		//System.out.printf("%-15s","编号");
		//System.out.printf("%-15s","姓名");
		//System.out.printf("%-15s","性别");
		//System.out.printf("%-15s","年龄");
		//System.out.printf("%-15s","电话");
		//System.out.printf("%-15s","邮箱");
		//System.out.println();
		System.out.println("----------------------------------------------------------------------");
		System.out.printf("%-12s %8s %8s %8s %25s %23s\n","编号","姓名","性别","年龄","电话","邮箱" );
		if(zdjl>0) {
		for(int a = 0;a<zdjl;a++) {
			if(khgl[a].getName()!=null&&khgl[a].getGender()!=null&&khgl[a].getAge()!=null&&khgl[a].getPhone()!=null
					&&khgl[a].getEmail()!=null) {
			//System.out.printf("%-15s",khgl[a].getName());
			//System.out.printf("%-15s",khgl[a].getGender());
			//System.out.printf("%-15s",khgl[a].getAge());
			//System.out.printf("%-15s",khgl[a].getPhone());
			//System.out.printf("%-15s",khgl[a].getEmail());
			//System.out.println();
			System.out.printf("%-12d %8s %8s %8s %25s %23s\n",a+1,khgl[a].getName(),khgl[a].getGender(),
					khgl[a].getAge(),khgl[a].getPhone(),khgl[a].getEmail());	
			}else
				break;
			}
		 }
	}
//	public Customer getCustomer(int index) {
//		return;
//	}

}
