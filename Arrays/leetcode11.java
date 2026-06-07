//todo          724. Find Pivot Index
// https://leetcode.com/problems/find-pivot-index/description/

public class leetcode11
{
    public static void main(String[] args) {

         int nums[] = {1,2,3};

        //!   Optimal method 
        //? for understanding see the notes on tlnote chrome .. 
        //  int sum = 0 ;
        //  for(int num : nums)
        //  {
        //      sum+=num ;
        //  }

        //  int left = 0 ; 
        //  int right = sum ;
          
        //  for(int i = 0 ; i<nums.length ; i++)
        //  {
        //     right = right - nums[i];
        //     if(left==right)
        //     {
        //         System.out.println(i);
        //         return ;
        //     }
        //     else
        //     {
        //         left = left + nums[i] ;
        //         right = sum - left ; 
        //     }
        //  }
        //  System.out.println(-1);

        //! Brute force Approach ... 
        // for(int i = 0 ; i<nums.length ;i++)
        // {
        //     int left = 0 ;
        //     int right = 0 ;
        //     for(int j = 0 ; j<nums.length ; j++)
        //     {
        //         if(i==j)
        //         {
              
        //         }
        //         else if (j<i) 
        //         {
        //             left+=nums[j] ;
        //         }
        //         else
        //         {
        //            right+= nums[j];
        //         }
        //     }
        //     if(left==right)
        //     {
        //         System.out.println(i);
        //         return ;
        //     }
        // }
    }
}