//todo        2225. Find Players With Zero or One Losses
// https://leetcode.com/problems/find-players-with-zero-or-one-losses/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class leetcode5
{
    public static void main(String[] args) {
        int[][] matches = { {2,3},{1,3},{5,4},{6,4}} ;

        HashMap<Integer,Integer> map = new HashMap<>();
        // for finding losers ... 
        for(int i = 0 ; i < matches.length ; i++)
        {
            int temp = matches[i][1];
            if(map.containsKey(temp))
            {
                map.put(temp,map.get(temp)+1);
            }
            else
            {
                map.put(temp,1);
            }
        }
        System.out.println(map);

 // answer[1] is a list of all players that have lost exactly one match.
        ArrayList<Integer> list1 = new ArrayList<>();
        for(Integer key : map.keySet())
        {
            if(map.get(key)==1)
            {
                list1.add(key);
            }
        }
        System.out.println(list1);
        
       Collections.sort(list1);

       HashSet<Integer> set = new HashSet<>();
       // For finding winners 
       for(int i = 0 ; i< matches.length ; i ++)
       {
            int temp = matches[i][0];
            set.add(temp);
       }
       System.out.println(set);

       // Finding the real winners 
       ArrayList<Integer> list2 = new ArrayList<>();
       for(Integer val : set)
       {
           if(!map.containsKey(val))
           {
                list2.add(val);
           }
       }
       System.out.println(list2);

       ArrayList<List<Integer>> finalList = new ArrayList<>() ;
       finalList.add(list2);
       finalList.add(list1);

       System.out.println(finalList);
    }
}