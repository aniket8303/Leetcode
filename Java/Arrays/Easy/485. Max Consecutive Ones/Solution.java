class Solution{
	public static void main(String[] args) {
		System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
		System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
	}
	public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        
        for (int ele : nums) {
            if (ele == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        
        return max;
    }

}