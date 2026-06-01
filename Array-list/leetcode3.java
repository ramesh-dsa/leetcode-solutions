// todo               217. Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/description/


// Using ArrayList

//! TLE Error solve this using HashSet 
import java.util.ArrayList ;
public class leetcode3
{
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<nums.length ; i++ ) 
        {
            if(list.contains(nums[i]))
            {
                System.out.println(true);
                return ;
            } 
            else
            {
            list.add(nums[i]) ; 
            }
        }
        System.out.println(false);
    }
}