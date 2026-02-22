class Solution{
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(-121));
		System.out.println(isPalindrome(10));
	}
	public static boolean isPalindrome(int x) {
        int temp = x;
        int res = 0;
        while(x>0){
            res = res*10 + (x%10);
            x /= 10;
        }
        if(temp==res){
            return true;
        }
        else {
           return false;
        }  
    }
}