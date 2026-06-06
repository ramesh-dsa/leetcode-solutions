// todo       392. Is Subsequence
// https://leetcode.com/problems/is-subsequence/description/

public class leetcode2
{
    public static void main(String[] args) {
        String s = "" ;
        String t = "abcde";

        int count = 0 ;
        int i = 0 ;
        int j  = 0 ;

        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                count++;
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }

        System.out.println(count==s.length());


    }
}