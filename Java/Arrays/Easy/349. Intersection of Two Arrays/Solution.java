import java.util.Arrays;
class Solution{
	public static void main(String[] args) {
		System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1},new int[]{2,2})));
		System.out.println(Arrays.toString(intersection(new int[]{4,9,5},new int[]{9,4,9,8,4})));
	}
	public static int[] intersection(int[] nums1, int[] nums2) {
    int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;
        
        for (int i = 0; i < nums1.length; i++) {  
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    boolean alreadyPresent = false;
                    for (int x = 0; x < k; x++) {
                        if (temp[x] == nums1[i]) {
                            alreadyPresent = true;
                            break;
                        }
                    }
                    
                    if (!alreadyPresent) {
                        temp[k++] = nums1[i];
                    }
                    break; 
                }
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }
        
        return result;
    }
}