// todo               217. Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/description/


// Using HashSet

import java.util.HashSet ;
public class leetcode1
{
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i<nums.length ; i++ ) 
        {
            if(set.contains(nums[i]))
            {
                System.out.println(true);
                return ;
            } 
            else
            {
            set.add(nums[i]) ; 
            }
        }
        System.out.println(false);
    }
}