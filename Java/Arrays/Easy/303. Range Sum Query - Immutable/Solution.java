class Solution{
	public static void main(String[] args) {
		 
        int[] arr = {1, 3, 5, 7, 9};
        
        NumArray obj = new NumArray(arr);
        
        System.out.println(obj.sumRange(0, 2)); // 1 + 3 + 5 = 9
        System.out.println(obj.sumRange(1, 3)); // 3 + 5 + 7 = 15
        System.out.println(obj.sumRange(2, 4)); // 5 + 7 + 9 = 21	}
    }
}
class NumArray {
    int [] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
       int sum = 0;
        for( ; left <=right ; left++){
            sum +=nums[left];
        }
        return sum;
    }
}