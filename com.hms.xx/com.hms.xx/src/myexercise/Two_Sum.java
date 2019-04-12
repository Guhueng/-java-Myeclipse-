package myexercise;

import java.util.Arrays;

////***给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//*
//*你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
//*
//*示例:
//*
//*给定 nums = [2, 7, 11, 15], target = 9
//*
//*因为 nums[0] + nums[1] = 2 + 7 = 9
//*所以返回 [0, 1]
//		**/
public class Two_Sum {
	
	    public static int[] twoSum(int[] nums, int target) {
	        int [] n = new int[2];
	       // java.util.Arrays.sort(nums);
	        for(int a=0,b=nums.length-1;a<nums.length-1&&a<=b&&b>-1;){
	            if(nums[a]+nums[b]==target){
	                n[0]=a;
	                n[1]=b;
	                break;
	            } else if(nums[a]+nums[b]>target){
	              b--;  
	            }else
	                a++;
	        } 
	        return n;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {4,10,21,36,25};
		System.out.println(Arrays.toString(twoSum(nums,40))); 
	}

}
