//todo           58. Length of Last Word
// https://leetcode.com/problems/length-of-last-word/description/

import java.util.Arrays;
public class leetcode2
{
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  " ;

        int count = 0 ;
        boolean check = false ;

        char[] sarr = s.toCharArray();
        System.out.println(Arrays.toString(sarr));
        for(int i = sarr.length-1 ; i>=0 ; i-- )
        {
            if(sarr[i]==' ')
            {
               if(count==0) 
               {
                continue ;
               }
               check = true ;
            }
            else
            {
                count++;
            }
            if(check)
            {
                System.out.println(count);
                return ;
            }
        }
    }
}