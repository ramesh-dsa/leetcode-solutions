//todo         2144. Minimum Cost of Buying Candies With Discount
// https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/description/?envType=daily-question&envId=2026-06-01

import java.util.Arrays;
public class leetcode20
{
    public static void main(String[] args) {
       int[] cost = {6,5,7,9,2,2} ;

       int output = 0 ;
        int count = 0 ;
        Arrays.sort(cost);
        for(int i = cost.length-1 ; i>=0 ; i--)
        {
            count++;
            if(count>2)
            {
                count = 0 ;
                continue ;
            }
            output = output + cost[i]; 
        }
        System.out.println(output);
    }
}