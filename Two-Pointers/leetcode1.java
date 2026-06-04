//todo            283. Move Zeroes
// https://leetcode.com/problems/move-zeroes/description/

import java.util.Arrays;
public class leetcode1
{
    public static void main(String[] args)
    {
         
        int[] nums = {0,1,0,3,12};

        int left = 0 ; 
        int right = 1 ;

        while(left<right && left <nums.length && right < nums.length)
        { 
            if(nums[left]==0)
            {
                if(nums[right]!=0)
                {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp ;
                    left++;
                    right++;
                }
                else
                {
                    right++;
                }
            }
            else
            {
                left++;
                right++;
            }
            
        }
        System.out.println(Arrays.toString(nums));
    
    }
}