//package lottery_project;

import java.util.Arrays;

import java.util.Random;

import java.util.Scanner;

public class MyLotteryMain {

	private static int[] Lotterygenerated1(int a) {// 此方法使用伪随机数Random类来创建奖池
		int[] hq = new int[a];
		Random rn = new Random();
		for (int cs = 0; cs < a; cs++) {
			hq[cs] = rn.nextInt(a+1);
		}
		return hq;
	}
//***********************************************************************************************************************	
	private static int[][] xzcp(int[][] a) {// 此方法以多重循环来记录购买的彩票，
		Scanner in = new Scanner(System.in);
		System.out.println("友情提示为了保证自己的中奖率红球的几率数最大33，蓝球为16");
		int[][] gmdcp = new int[a.length][7];
		for (int xhw = 0; xhw < a.length; xhw++) {
			int[] jl = new int [7];
			for (int xhl = 0; xhl < 6; xhl++) {
					System.out.println("请输入第" + (xhl + 1) + "红球选择数：");
					jl [xhl]= in.nextInt();
				}
			qc(jl,34,2); 
			gmdcp[xhw]=jl;
					System.out.println("请输入蓝球选择数：");
					gmdcp[xhw][6] = in.nextInt();
				}return gmdcp;// 记录好的数组返回main方法。
			}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	private static int[][] cpkj(int[][] gmcp, int[] hq, int[] lq) {
		int[][] jl = new int[gmcp.length][2];
		for (int a = 0; a < gmcp.length; a++) {
			int hqpp = 0;
			int lqpp = 0;// 记录两个色球分别匹配多少次
			for (int b = 0; b < 7; b++) {
				if (b < 6) {
					if (Arrays.binarySearch(hq, gmcp[a][b]) <= 0) {// Arrays类的二分查找法
						hqpp++;
					}
				} else {
					if (Arrays.binarySearch(lq, gmcp[a][b]) <= 0) {
						lqpp++;
					}
				}
			}
			jl[a][0] = hqpp;
			jl[a][1] = lqpp;
		}
		return jl;
	}
	// *********************************************************************************************************
	private static void zhdpd(int[][] a, int[][] gmcp) {
		System.out.println("共买" + a.length + "注，花费" + (a.length * 2) + "元。");
		for (int blcp = 0; blcp < gmcp.length; blcp++) {
			System.out.println("购买的彩票号码" + Arrays.toString(gmcp[blcp]));
		}
		for (int z = 0; z < a.length; z++) {
			System.out.println("第" + (z + 1) + "中奖情况");
			if (a[z][0] == 6 && a[z][1] == 1) {
				System.out.println("彩票号码" + Arrays.toString(gmcp[z]));
				System.out.println("恭喜一等奖，获得奖金66666666元");
			} else if (a[z][0] == 6) {
				System.out.println("彩票号码" + Arrays.toString(gmcp[z]));
				System.out.println("恭喜二等奖，获得奖金31400000元");
			} else if (a[z][0] == 5 && a[z][1] == 1) {
				System.out.println("彩票号码" + Arrays.toString(gmcp[z]));
				System.out.println("恭喜三等奖，获得奖金5000000元");
			} else if (a[z][0] == 5 || (a[z][0] == 4 && a[z][1] == 1)) {
				System.out.println("彩票号码" + Arrays.toString(gmcp[z]));
				System.out.println("恭喜四等奖，获得奖金100000元");
			} else if (a[z][0] == 4 || (a[z][0] == 3 && a[z][1] == 1)) {
				System.out.println("彩票号码" + Arrays.toString(gmcp[z]));
				System.out.println("恭喜五等奖，获得奖金70000元");
			} else if (a[z][1] == 1) {
				System.out.println("彩票号码" + Arrays.toString(gmcp[z]));
				System.out.println("恭喜六等奖，获得奖金50000元");
			} else
				System.out.println("很遗憾你没有中奖");
		}
	}
	//*******************去重********************************************************************
	private static void qc(int[] ccc,int a,int bb) {//依次分别是传进数组，随机数大小，分支选择
		// TODO Auto-generated method stub
		Random sjs = new Random();
		Scanner xx = new Scanner(System.in);
		switch (bb) {
		case 1:
			for(int b = 0 ;b<ccc.length;b++) {
				for(int c = 0;c<ccc.length;c++) {
					if(b!=c&&ccc[b]==ccc[c]) {
							ccc[b]=sjs.nextInt(a);
							c=-1;
					}
				}
			}
			break;
		case 2:
			for(int b = 0 ;b<ccc.length;b++) {
				for(int c = 0;c<ccc.length;c++) {
					if(b!=c&&ccc[b]==ccc[c]) {
						System.out.println("选择号重复请重新输入：");
							ccc[b]=xx.nextInt(a);
							c=-1;
							break;
					}
				}
			}
		}
	}
//------------------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] hq = Lotterygenerated1(33);
		int[] lq = Lotterygenerated1(16);
		// 为奖池定型
		Arrays.sort(hq);
		Arrays.sort(lq);
		// 排序数组
		qc(hq,34,1);
		qc(lq,17,1);
		// System.out.println(Arrays.toString(lottery));//查看奖池数字
		boolean xh = true;
		int[][] gmcp = null;
		while (xh) {
			System.out.println("                    *******--欢迎来到双色球彩票系统--*******");
			System.out.println("                            1.购买彩票");
			System.out.println("                            2.开奖查询");
			System.out.println("                            3.退出");
			System.out.println("                   -------------------------------------------");
			System.out.println("请选择所进入的系统：");
			int xz = in.nextInt();
			switch (xz) {
			case 1:
				System.out.println("请选择购买股票数量：");
				int a = in.nextInt();// a变量为二维数组的行数用来记录买了多少彩票
				gmcp = new int[a][7];
				gmcp = xzcp(gmcp);
				break;
			case 2:
				if (gmcp != null) {
					int zjjl[][] = cpkj(gmcp, hq, lq);// zjjl这个数组用来记录不同注的中奖情况
					zhdpd(zjjl, gmcp);
				} else
					System.out.println("请购买彩票！");
				break;
			case 3:
				System.out.println("谢谢使用！");
				xh = false;
				break;
			}
		}
	}
}
