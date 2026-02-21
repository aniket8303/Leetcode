import java.util.*;
class Solution{
	public static void main(String[] args) {
		System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1} , 3));
		System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1} , 1));
		System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3} , 2));
	}
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i<nums.length ; i++){
            for(int j = i+1;j<=i+k && j<nums.length ; j++)
            if(nums[i]==nums[j])
            return true;
        }
        return false;
    }
}