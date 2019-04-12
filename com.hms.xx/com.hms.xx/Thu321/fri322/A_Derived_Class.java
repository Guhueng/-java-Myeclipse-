package fri322;


class human {
	private String neam ;
	private int age;
	
	public human(String neam, int age) {
		
		this.neam = neam;
		this.age = age;
	}
	public void gethuman(String neam, int age) {
		
		this.neam = neam;
		this.age = age;
	}
	public void go(System a) {
		System.out.println("去"+a);
	}
	public void sethq() {
		System.out.println("姓名:"+neam+"年龄:"+age);
	}
}
public class A_Derived_Class {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human xs = new human("小米",21);
		xs.sethq();
		xs.gethuman("华为",20);
		xs.sethq();
	}

}
