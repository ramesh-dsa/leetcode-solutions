//todo       414. Third Maximum Number
// https://leetcode.com/problems/third-maximum-number/description/

import java.util.ArrayList;
import java.util.Arrays;
public class leetcode4
{
    public static void main(String[] args) {
        int[] nums = {2,2,3,1} ;
        Arrays.sort(nums);
        if(nums.length <= 2 )
        {
            System.out.println(nums[nums.length-1]);
            return ;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums)
        {
            if(!list.contains(num))
            {
               list.add(num);
            }
        }
        System.out.println(list.get(list.size()-3));
    }
}