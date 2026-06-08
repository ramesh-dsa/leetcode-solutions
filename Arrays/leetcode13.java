//todo         1470. Shuffle the Array
// https://leetcode.com/problems/shuffle-the-array/description/

import java.util.Arrays;

public class leetcode13
{
    public static void main(String[] args) 
    {
       int[] nums = {2,5,1,3,4,7}; // [2,3,5,4,1,7] 

       int n = 3;
       int[] dup = new int[nums.length];
       for(int i = 0 ; i<n; i++)
       {
         dup[i+i] = nums[i];
         dup[i+i+1] = nums[n+i];
       }
       System.out.println(Arrays.toString(dup));
    }
}