//todo       2465. Number of Distinct Averages
// https://leetcode.com/problems/number-of-distinct-averages/description/

import java.util.Arrays;
import java.util.HashSet;

public class leetcode4
{
    public static void main(String[] args) {
       
       int[] nums = {4,1,4,0,3,5};

       HashSet<Double> set = new HashSet<>() ;
       Arrays.sort(nums);
      // System.out.println(Arrays.toString(nums));
       int i = 0 ;
       int j = nums.length-1 ;
       while(i<j)
       {
            set.add((nums[i] + nums[j])/2.0);
            i++;
            j--;
       }
      // System.out.println(set);
       System.out.println(set.size());
       
    }
}