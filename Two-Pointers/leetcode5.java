//todo        392. Is Subsequence
// https://leetcode.com/problems/is-subsequence/description/

/*
class Solution {
    public boolean isSubsequence(String s, String t) {
        int count =  0 ;
        int i = 0 ;
        int j = 0 ;
        while(i<s.length() && j<t.length() )
        {
           // System.out.println(j);
            if(s.charAt(i)== t.charAt(j))
            {
                count++;
                i++;
            }
            j++;
        }
        return count==s.length();
    }
}
*/