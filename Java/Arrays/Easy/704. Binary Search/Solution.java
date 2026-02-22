class Solution{
	public static void main(String[] args) {
		System.out.println(search(new int[]{-1,0,3,5,9,12},9));
		System.out.println(search(new int[]{-1,0,3,5,9,12},2));
	}
	 public static int search(int[] nums, int target) {
    int n = nums.length;  
       int min = 0;
		int max = n-1;
		while(min<=max){
			int mid = (min+max)/2;
			if(target<nums[mid]) max = mid -1;
			else if(target>nums[mid]) min = mid +1;
			else return mid;
		}
		return -1; 
    }
}