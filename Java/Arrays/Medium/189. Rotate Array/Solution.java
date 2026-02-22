import java.util.Arrays;
class Solution{
	public static void main(String[] args) {
		rotate(new int[]{1,2,3,4,5,6,7},3);
		rotate(new int[]{-1,-100,3,99},2);
	}
	 public static void rotate(int [] nums, int k) {
       int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
           int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

}