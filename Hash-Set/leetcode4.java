//todo     1207. Unique Number of Occurrences
// https://leetcode.com/problems/unique-number-of-occurrences/description/

import java.util.HashMap;
import java.util.HashSet;

public class leetcode4
{
    public static void main(String[] args) 
    {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0} ;   

        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int ar : arr)
        {
            map.put(ar,map.getOrDefault(ar, 0)+1);
        }

        for(Integer ma : map.keySet())
        {
            if(set.contains(map.get(ma)))
            {
               System.out.println(false);
               return ;
            }
            else
            {
                set.add(map.get(ma));
            }
        }
        //System.out.println(map.get(0));
        //System.out.println(map);
        System.out.println(true);
    }
}