//todo           125. Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/description/

public class leetcode1
{
    public static void main(String[] args) {
        
        
       String s = "A man, a plan, a canal: Panama" ; 
       if(s=="")
       {
        System.out.println(true);
        return ;
       }

       s = s.replaceAll("[^A-Za-z]","");
       s= s.toLowerCase();
       System.out.println(s);

       StringBuilder str = new StringBuilder(s);
       str.reverse();
       System.out.println(str);
       String str1 = str.toString();

       if(str1.equals(s)) 
       {
        System.out.println(true);
        return ;
       }
     System.out.println(false);
    }
}