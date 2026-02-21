import java.util.*;
class Solution{
	public static void main(String[] args) {
		System.out.println(majorityElement(new int[]{3,2,3}));
		System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
	}
	 public static int majorityElement(int[] nums) {
        boolean []b = new boolean[nums.length];
        int firstMax = Integer.MIN_VALUE;
        int firstElement = 0;
        for(int i = 0; i< nums.length ; i++){
            if(b[i])continue;
            int cnt = 1;
            for(int j =i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    cnt++;
                    b[j] = true; 
                }
            }
            if(cnt > firstMax){
                firstMax = cnt;
                firstElement = nums[i];
            }
        }
        return firstElement;
    }
}