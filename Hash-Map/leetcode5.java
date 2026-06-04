//todo     387. First Unique Character in a String
// https://leetcode.com/problems/first-unique-character-in-a-string/description/



//! Stucked 
//! chatgpt solution 0(n)
/*
import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
*/

//! my own solution O(n2)
import java.util.HashSet;

public class leetcode5
{
    public static void main(String[] args) 
    {
       HashSet<Character> set = new HashSet<>();
        String s = "loveleetcode" ;
        String temp = s;
        for(char ch : s.toCharArray())
        {
            if(set.contains(ch))
            {
               temp = temp.replaceAll(String.valueOf(ch),"");
            }
            else
            {
                 set.add(ch);
                 System.out.println(set);
            }
        }

        
        if(temp.length()>0)
        {
           int index = s.indexOf(temp.charAt(0));
           System.out.println(index);
           return ;
        }
      
        
      System.out.println(-1);  
    }
    
}