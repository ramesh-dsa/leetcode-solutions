//todo        1748. Sum of Unique Elements
// https://leetcode.com/problems/sum-of-unique-elements/description/  

import java.util.HashMap;
public class leetcode6
{
    public static void main(String[] args) 
    {
        int[] nums = {1,1,1,1,1} ;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            // Instead of these 4 lines we can also use 
            //!  map.put(num , map.getOrDefault(num,0)+1); 

            if(map.containsKey(num))
            {
                map.put(num,map.get(num)+1);
            }
            else
            {
                map.put(num,1);
            }
        }
        int sum = 0 ;
        for(Integer ma : map.keySet())
        {
           if(map.get(ma)==1)
           {
            sum = sum + ma;
           }
        }
        System.out.println(sum);
    }
}