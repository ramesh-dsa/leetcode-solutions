//todo     26. Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=problem-list-v2&envId=defcow5m

import java.util.HashSet;

public class leetcode3
{
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        HashSet<Integer> set = new HashSet<>();
        int index = 0 ;
        for(int num : nums)
        {
            if(!set.contains(num))
            {
               set.add(num);
               nums[index++]=num;
            }
        }
       
        System.out.println(set);

    }
}