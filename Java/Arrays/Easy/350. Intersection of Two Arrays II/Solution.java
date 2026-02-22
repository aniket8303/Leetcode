import java.util.Arrays;
class Solution{
	public static void main(String[] args) {
		System.out.println(Arrays.toString(intersect(new int[]{1,2,2,1},new int[]{2,2})));
		System.out.println(Arrays.toString(intersect(new int[]{4,9,5},new int[]{9,4,9,8,4})));
	}
	public static int[] intersect(int[] nums1, int[] nums2) {
        int [] temp = new int[Math.min(nums1.length,nums2.length)];
        int k = 0;
        for(int i = 0 ;i<nums1.length;i++){
            for(int j = 0; j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                   temp[k++] = nums1[i];
                   nums2[j] = -1; 
                    break;
                }
            }
        }
        int [] result  = new int[k];
        for(int i = 0; i<k; i++){
            result[i] = temp[i];
        }
        return result;
    }
}