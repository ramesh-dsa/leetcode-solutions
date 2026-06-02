//todo               1.Two Sum 
//     https://leetcode.com/problems/two-sum/

//!            Brute force Method 

// public class leetcode1
// {
//     public static void main(String[] args) {
//         int[] nums  = {3,2,4};
//         int target = 6 ;
//         for(int i = 0 ; i<nums.length-1 ; i++)
//         {     
//           for(int j = i+1 ; j <nums.length; j++)
//            {
//               if(nums[i]+nums[j]==target)
//               {
//                  System.out.println(i+" " +j);   
//                }   
//             }
//         }
//     }
// }

//!                      HashMap method 

import java.util.HashMap;
public class leetcode1
{
    public static void main(String[] args) {
        

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] nums  = {3,2,4};
        int target = 6 ;

         for(int i = 0 ; i<nums.length ; i ++)
         {
            if(map.containsKey(target-nums[i]))
            {
               System.out.println(i +"\t"+ map.get(target-nums[i]));
            }
            else
            {
               
               map.put(nums[i],i);
                System.out.println(map);
            }
         }

         System.out.println(map);
    }
}





