import java.util.*;
class Solution{
	public static void main(String[] args) {
		System.out.println(findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
		System.out.println(findDuplicates(new int[]{1,1,2}));
		System.out.println(findDuplicates(new int[]{1}));
	}
	public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;

            // already negative → duplicate found
            if(nums[index] < 0){
                result.add(Math.abs(nums[i]));
            }
            else{
                nums[index] = -nums[index]; // mark visited
            }
        }

        return result;
    }
}