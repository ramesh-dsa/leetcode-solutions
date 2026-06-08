//todo         1512. Number of Good Pairs
// https://leetcode.com/problems/number-of-good-pairs/description/

public class leetcode14
{
    public static void main(String[] args) 
    {
        int[] nums = {1,2,3,1,1,3};
        int output = 0 ;
        int i = 0 ;
        int j = i+1 ;

        while(j<nums.length) 
        { 
           if(nums[i]==nums[j] && i<j)
            {
                output++;
            }  
           if(j+1==nums.length)
                {
                    i++;
                    j=i+1 ;
                }
                else
                {
                    j++;
                }
        }
        System.out.println(output);
    }
}