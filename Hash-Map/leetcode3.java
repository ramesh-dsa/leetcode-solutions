//todo              136. Single Number
// https://leetcode.com/problems/single-number/description/

import java.util.HashMap;
public class leetcode3
{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] nums = {2,2,1};

        int min = Integer.MAX_VALUE;
        for(int num : nums)
        {
            if(map.containsKey(num))
            {
               map.put(num,map.get(num)+1);
            }
            else
            {
               map.put(num,1);
            }
        }
        System.out.println(map);

        int answer = 0 ;
        for(int i : map.keySet())
        {
            if(map.get(i)<min)
            {
                min = map.get(i);
                answer = i ;
            }
        }

        System.out.println(answer);
        
    }
}

