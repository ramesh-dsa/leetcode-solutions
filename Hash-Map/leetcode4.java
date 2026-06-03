//todo                   383. Ransom Note
// https://leetcode.com/problems/ransom-note/description/

import java.util.HashMap;
public class leetcode4
{
    public static void main(String[] args) 
    {

        HashMap<Character,Integer> map = new HashMap<>();
          String ransomNote = "bg" ; 
          String magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"; 

          char[] Notes =  ransomNote.toCharArray();
          char[] mags = magazine.toCharArray();
          
          for(char mag : mags)
          {
            if(map.containsKey(mag))
            {
               map.put(mag,map.get(mag)+1);
            }
            else
            {
                map.put(mag,1);
            }
          }
          for(char Note: Notes)
          {
            if(map.containsKey(Note))
            {
               if(map.get(Note)== 0)
               {
                System.out.println(false);
                return ;
               }
               else
               {
                map.put(Note,map.get(Note)-1);
               }
            }
            else
            {
                System.out.println(false);
                return ;
            }
          }

    System.out.println(true);
    }
}