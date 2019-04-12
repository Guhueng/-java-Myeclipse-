package client_information_management;

import java.util.Scanner;

public class CustomerView extends CustomerList {
	Scanner in = new Scanner(System.in);
	public CustomerView(int szdx) {
		super(szdx);
		// TODO Auto-generated constructor stub
	}

	public void enterMainMenu() {//输出主菜单
		System.out.println("------------------------------------------------------");
		System.out.println("1 添加客户");
		System.out.println("2 修改客户");
		System.out.println("3 删除客户");
		System.out.println("4 客户列表");
		System.out.println("5 保存本地客户资料");
		System.out.println("6 退出");
		System.out.println("------------------------------------------------------");
		System.out.println("请选择:");
	}
		
	public void addNewCustomer() {//增加客户
		Customer kh = new Customer();
		System.out.println("请输入姓名:");
		String a =in.nextLine();
		kh.setName(a);
		System.out.println("请输入性别");
		String b =in.nextLine();
		kh.setGender(b);
		System.out.println("请输入年龄(0-99):");
		String c = in.nextLine();
		kh.setAge(c);
		System.out.println("请输入电话号码:");
		String d =in.nextLine();
		kh.setPhone(d);
		System.out.println("请输入邮箱:");
		String e =in.nextLine();
		kh.setEmail(e);
		if(addCustomer(kh)) {
			System.out.println("添加成功");
		}else
			System.out.println("添加失败");
	}
		
	
	public void modifyCustomer() {//修改客户
		System.out.println("请选择修改客户的编号:");
		int bh = in.nextInt();
		if(bh>0&&bh<khgl.length) {
			Customer kh = new Customer();
			
			System.out.println("姓名("+(khgl[bh-1].getName())+"):");
			String a =in.nextLine();
			if(a.length()>0) {
				kh.setName(a);
			}else
				kh.setName(khgl[bh-1].getName());
			
			System.out.println("性别("+(khgl[bh-1].getGender()) +"):");
			String b =in.nextLine();
			if(b.length()>0) {
				kh.setGender(b);
			}else
				kh.setGender(khgl[bh-1].getGender());
			
			System.out.println("年龄(0-99)("+(khgl[bh-1].getAge()) +"):");
			String c = in.nextLine();
			kh.setAge(c);
			
			System.out.println("电话("+(khgl[bh-1].getPhone()) +"):");
			String d =in.nextLine();
			if(d.length()>0) {
				kh.setPhone(d);
			}else
				kh.setPhone(khgl[bh-1].getPhone());
			
			System.out.println("邮箱("+ (khgl[bh-1].getEmail())+"):");
			String e =in.nextLine();
			if(e.length()>0) {
				kh.setEmail(e);
			}else
				kh.setEmail(khgl[bh-1].getEmail());
			
			if(replaceCustomer(bh-1,kh)) {
				System.out.println("添加成功");
			}else
				System.out.println("添加失败");
			
			}else if(bh==-1) {
				System.out.println("程序结束,谢谢使用");
			}
			else
				System.out.println("违规的编号!以退出子选项!");
		
	}
		
	
	
	public void deleteCustomer() {//删除客户
		System.out.println("请选择想要删除的客户编号:(-1退出)");
		int sc = in.nextInt();
		while(true) {
			if(sc==-1) {
				System.out.println("结束程序,谢谢使用!");
				break;
			}
			if(sc>0&&sc<khgl.length) {
				deleteCustomer(sc-1);
				break;
			}
		}
	}
	
	public void listAllCustomers() {//列出所有客户
		getAllCustomers();
	}
}
