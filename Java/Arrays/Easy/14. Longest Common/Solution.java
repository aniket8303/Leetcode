import java.util.Arrays;
class Solution{
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
		System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
	}
	 public static String longestCommonPrefix(String[] strs) {
       String op = "";
       String fe = strs[0];
       outerLoop:
       for(int i = 0; i<fe.length();i++){
        for(int j =1;j<strs.length;j++){
            if(strs[j].length()==i) break outerLoop;
            if(fe.charAt(i)!=strs[j].charAt(i))
            {
                break outerLoop;
            }
        }
        op+=fe.charAt(i);
       } 
       return op;
    }
}