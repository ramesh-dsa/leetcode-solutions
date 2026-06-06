//todo               27. Remove Element
// https://leetcode.com/problems/remove-element/description/

import java.util.Arrays;
public class leetcode3
{
    public static void main(String[] args) {
            int[] nums = {3,2,2,3};
            System.out.println(Arrays.toString(nums));
            int val = 3 ; 
           int count = 0 ;
            
            for(int i = 0 ; i<nums.length ; i++)
            {
                if(nums[i]!=val)
                {
                   nums[count] = nums[i] ;
                    count++ ;
                }     
            }
             System.out.println(Arrays.toString(nums));
    }
}