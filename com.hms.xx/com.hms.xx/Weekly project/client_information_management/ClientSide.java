package client_information_management;

import java.util.Scanner;

public class ClientSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		CustomerView a = new CustomerView(10);
		tc:
		while(true) {
		a.enterMainMenu();
		int xz = in.nextInt();
			if(xz==1||xz==2||xz==3||xz==4||xz==5||xz==6 ) {
				switch(xz) {
				case 1:
					a.addNewCustomer();
					break;
				case 2:
					a.modifyCustomer();
					break;
				case 3:
					a.deleteCustomer();
					break;
				case 4:
					a.listAllCustomers();
					break;
				case 5:
					break;
				case 6:
					break tc;
				}
			}else
				System.out.println("输入错误,请重新输入");
		}
		System.out.println("已退出.");
	}

}
