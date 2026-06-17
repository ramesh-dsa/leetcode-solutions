// todo      2215. Find the Difference of Two Arrays
// https://leetcode.com/problems/find-the-difference-of-two-arrays/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode5
{
    public static void main(String[] args) {
        int[] nums1 = {1,2,3} ;
        int[] nums2 = {2,4,6} ; 

        
        ArrayList<Integer> list1 = new ArrayList<>() ;
        ArrayList<Integer> list2 = new ArrayList<>() ;
        ArrayList<List<Integer>> finalList = new ArrayList<>() ;

        HashMap<Integer,Integer> set1 = new HashMap<>();
        HashMap<Integer,Integer> set2 = new HashMap<>();

        // HashMap for 1st array 
        for(int nums : nums1)
        {
            if(set1.containsKey(nums))
            {
               // set1.put(nums,set1.get(nums)+1);
            }
            else
            {
                set1.put(nums,1);
            }
        }

        // HashMap for 2nd array 
        for(int nums : nums2)
        {
            if(set2.containsKey(nums))
            {
               // set2.put(nums,set2.get(nums)+1);
            }
            else
            {
                set2.put(nums,1);
            }
        }
 
        System.out.println(set1);
        System.out.println(set2);
        // Forming a list1
        for(Integer set : set1.keySet())
        {
            if(!(set2.containsKey(set)))
            {
                list1.add(set);
            }
        }

        // forming a List2 
        for(Integer set : set2.keySet())
        {
            if(!(set1.containsKey(set)))
            {
                list2.add(set);
            }
        }

        // Final list 
        finalList.add(list1);
        finalList.add(list2);

        // Output 
        System.out.println(finalList);
    }
}