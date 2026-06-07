//todo            238 (Product of Array Except Self)
// https://leetcode.com/problems/product-of-array-except-self/descri    ption/

public class leetcode10
{
    public static void main(String[] args) 
    {
         int[] nums = {-1,1,0,-3,3};    
         int[] ans = new int[nums.length];

         //! Brute force method ... 
        //  for(int i = 0 ; i<nums.length ; i ++)
        //  {
        //     int product = 1 ;
        //     for(int j = 0 ; j<nums.length ; j++)
        //     {
        //         if(i!=j)
        //         {
        //             product = product*nums[j];
        //         }
        //     }
        //     ans[i] = product ;
        //  }
        //  System.out.println(Arrays.toString(ans));

       // todo optimal approach but question la division use pannakudathu .. 
       //?  So even though efficient ethu correct answer ella 
        // int product = 1 ;
        // int zerocount = 0 ;
        // int index =  0 ;
        // for(int i = 0 ; i<nums.length ; i++)
        // {
        //     if(nums[i]!=0)
        //     {
        //        product*=nums[i];
        //     }
        //     else
        //     {
        //         zerocount++;
        //         index = i ;
        //     }
        // }
        // System.out.println(index);
        // if(zerocount==1)
        // {
        //     ans[index] = product ;
        //     System.out.println(Arrays.toString(ans));
        //     return ;
        // }
        // if(zerocount>1)
        // {
        //     System.out.println(Arrays.toString(ans));
        //     return ;
        // }
        
        // for(int i = 0 ; i<nums.length ; i++)
        // {
        //     ans[i] = product/nums[i];
        // }
        // System.out.println(Arrays.toString(ans));

        

    }
}