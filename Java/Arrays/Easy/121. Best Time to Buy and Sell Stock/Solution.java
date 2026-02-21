import java.util.*;
class Solution{
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
		System.out.println(maxProfit(new int[]{7,6,4,3,1}));
	}
	public static int maxProfit(int[] prices) {
         int min = prices[0];
        int maxp = 0;

        for(int i = 1; i < prices.length; i++){   
            int profit = prices[i] - min;

            if(profit > maxp)
                maxp = profit;

            if(prices[i] < min)
                min = prices[i];
        }

        return maxp;
    }
}