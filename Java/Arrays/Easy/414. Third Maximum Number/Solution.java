class Solution{
	public static void main(String[] args) {
		System.out.println(thirdMax(new int[]{3,2,1}));
		System.out.println(thirdMax(new int[]{1,2}));
		System.out.println(thirdMax(new int[]{2,2,3,1}));
	}
	 public static int thirdMax(int[] nums) {
       long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int ele : nums) {

            if (ele == first || ele == second || ele == third)
                continue;

            if (ele > first) {
                third = second;
                second = first;
                first = ele;
            } 
            else if (ele > second) {
                third = second;
                second = ele;
            } 
            else if (ele > third) {
                third = ele;
            }
        }

        return third == Long.MIN_VALUE ? (int) first : (int) third;
   }
}