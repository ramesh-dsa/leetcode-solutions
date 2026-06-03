//todo                169. Majority Element
// https://leetcode.com/problems/majority-element/description/

import java.util.HashMap;
public class leetcode2
{
    public static void main(String[] args)
    {
       HashMap<Integer,Integer> map = new HashMap<>();
        int[] nums = {2,2,1,1,1,2,2};

        int max = 0 ; 
        int answer = 0 ;

        for(int num : nums )
        {  
          if(map.containsKey(num))
          {
              map.put(num,map.get(num)+1);
          }
          else
            {
                map.put(num,1);
            } 
          
          System.out.println(map);
          if(map.get(num)>max)
          {
             max = map.get(num);
             answer = num ;
          } 
        }

        System.out.println(answer);
    }
}