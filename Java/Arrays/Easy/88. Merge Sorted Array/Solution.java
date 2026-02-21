import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,0,0,0};
        merge(a1,3,new int[]{2,5,6},3);
        System.out.println(Arrays.toString(a1));

        int[] a2 = {1};
        merge(a2,1,new int[]{},0);
        System.out.println(Arrays.toString(a2));

        int[] a3 = {0};
        merge(a3,0,new int[]{1},1);
        System.out.println(Arrays.toString(a3));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (nums1[i] > nums2[j]) {
                for (int k = m - 1; k >= i; k--) {
                    nums1[k + 1] = nums1[k];
                }
                nums1[i] = nums2[j];
                m++;
                j++;
                i++;
            } else {
                i++;
            }
        }

        while (j < n) {
            nums1[i++] = nums2[j++];
        }
    }
}