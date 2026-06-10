//todo             2733. Neither Minimum nor Maximum
// https://leetcode.com/problems/neither-minimum-nor-maximum/description/

import java.util.Arrays;
public class leetcode19
{
    public static void main(String[] args) 
    {
          int[] nums = {3,2,1,4};
          if(nums.length<=2)
          {
            System.out.println(-1);
            return;
          }
          Arrays.sort(nums);
          System.out.println(nums[nums.length/2]);
    }
}