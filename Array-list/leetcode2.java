//todo       1929. Concatenation of Array
// https://leetcode.com/problems/concatenation-of-array/description/

// Using Array approach 
import java.util.Arrays;
public class leetcode2
{
    public static void main(String[] args)
    {
        
       int[] nums = {1,2,1,3};    
       int[] ans = new int[nums.length*2];

       for(int i = 0 ; i<nums.length ; i++)
        {
            ans[i] = nums[i] ; 
            ans[nums.length + i ] = nums[i] ; 
        }

        System.out.println(Arrays.toString(ans));
    }
}