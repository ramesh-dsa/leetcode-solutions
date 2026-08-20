//todo   https://leetcode.com/problems/valid-parentheses/

/*
class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 == 1 )
        {
            return false ;
        }
        char arr[] = new char[s.length()];
        int top = -1 ; 
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('  )
            {
                top++;
                arr[top] = s.charAt(i);
            }
            else
            {
                if(top == -1){return false ; }
                if(  (s.charAt(i) == ')') && (arr[top] != '[' && arr[top] != '{' )  || 
                     (s.charAt(i) == ']') && (arr[top] != '(' && arr[top] != '{' )  ||
                     (s.charAt(i) == '}') && (arr[top] != '(' && arr[top] != '[' ) ){

                        top--;

                     }
                     else{
                        return false  ;
                     }
            }
        }
        return (top == -1 );
    }
}
*/