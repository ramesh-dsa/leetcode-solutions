//todo           844. Backspace String Compare
// https://leetcode.com/problems/backspace-string-compare/description/

public class leetcode16
{
    public static void main(String[] args) 
    {
        String  s = "a##c"; 
        String  t = "#a#c" ;

       while(s.contains("#"))
       {
        if(s.startsWith("#"))
        {
            s=s.replaceFirst("#", "");
        }
        else
        {
            s= s.replaceFirst("[^#]#","");
        }
       }

       while(t.contains("#"))
       {
        if(t.startsWith("#"))
        {
           t=t.replaceFirst("#", "");
        }
        else
        {
            t= t.replaceFirst("[^#]#","");
        }
       }
       System.out.println(s.equals(t));

    }
}