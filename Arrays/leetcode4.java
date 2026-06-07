//todo              35. Search Insert Position
// https://leetcode.com/problems/search-insert-position/description/

import java.util.Arrays;

public class leetcode4
{
    static int searchInsert(int[] nums , int target)
    {
        if(Arrays.binarySearch(nums,target) >= 0 )
       {
            return (Arrays.binarySearch(nums,target));
       }
        return (Math.abs(Arrays.binarySearch(nums,target) + 1 ));
    }
    public static void main(String[] args)
    {
       int[] nums = {1,3,5,6};
       int target = 8 ;
       System.out.println(searchInsert(nums, target));
    }
}