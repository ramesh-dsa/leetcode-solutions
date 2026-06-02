//todo               349. Intersection of Two Arrays
// https://leetcode.com/problems/intersection-of-two-arrays/description/

import java.util.Arrays;
import java.util.HashSet;
public class leetcode2
{
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        for(int i = 0 ; i<nums1.length ; i++)
        {
            for(int j = 0 ; j<nums2.length ; j++)
            {
                if(nums1[i]==nums2[j]) 
                {
                   set.add(nums1[i]);
                }
            }
        }
        System.out.println(Arrays.toString(set.toArray()));

    }
}