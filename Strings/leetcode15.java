//todo       1221. Split a String in Balanced Strings
// https://leetcode.com/problems/split-a-string-in-balanced-strings/description/

public class leetcode15
{
    public static void main(String[] args) 
    {
        String s= "RLRRRLLRLL" ;
        
        int balance = 0  ;
        int count = 0 ;
        for(char ch: s.toCharArray())
        {
            if(ch=='R')
            {
                balance++;
            }
            else if(ch=='L')
            {
                balance --;
            }
            if(balance == 0 )
            {
                count++;
            }
        }
        System.out.println(count);
    }
}