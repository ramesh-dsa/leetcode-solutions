//todo 2824. Count Pairs Whose Sum is Less than Target
// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/

public class leetcode25
{
    public static void main(String[] args) {
        int[] nums = {-6,2,5,-2,-7,-1,3} ;
        int target = -2 ;
        int count = 0 ;
        for(int i = 0 ; i<nums.length - 1 ;i++)
        {
            for(int j = i+1 ; j<nums.length ; j++)
            {
               if(nums[i]+nums[j] < target )
               {
                count++;
               }
            }
        }
        System.out.println(count);
    }
}