//todo              1431. Kids With the Greatest Number of Candies
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode15
{
    public static void main(String[] args) 
    {
        int[] candies = {4,2,1,1,2} ; 
        int extraCandies = 1 ; 
        
        Boolean[] result  = new Boolean[candies.length];
        for(int i= 0 ; i<candies.length ;i++)
        {
            int temp = candies[i] ;
            candies[i] = candies[i] + extraCandies ;
            boolean check = true ;
            for(int j = 0 ; j<candies.length ; j++)
            {
                if(i==j)
                {
                   
                }
                else if(candies[i]>=candies[j])
                {
                    
                }
                else
                {
                    check  = false ;
                    break ;
                }
            }
            candies[i] = temp ;
            result[i] = check ;
        }
        ArrayList<Boolean> list = new ArrayList<>(Arrays.asList(result));
        System.out.println(list);
        System.out.println(Arrays.toString(result));
    }
}