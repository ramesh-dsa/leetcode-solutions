//todo           344. Reverse String
// https://leetcode.com/problems/reverse-string/description/

import java.util.Arrays ;
public class leetcode2
{
    public static void main(String[] args)
    {
      
        char[] s = {'H','a','n','n','a','h'} ;
        

        //! My 1st approach 
        // int start = 0 ;
        // int end = s.length-1;

        // while(start<end)
        // {
        //    char  temp = s[start];
        //     s[start] = s[end] ;
        //     s[end] = temp ;
        //     System.out.println(Arrays.toString(s));

        //     start ++ ;
        //     end -- ;
        // }

        //! My second approach 
        for(int i = 0 ; i < s.length/2; i ++)
        {
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp ;
        }
        System.out.println(Arrays.toString(s));
        
    }
}