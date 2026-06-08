//todo     1684. Count the Number of Consistent Strings
//  https://leetcode.com/problems/count-the-number-of-consistent-strings/description/

public class leetcode13
{
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"} ;
        int count = 0 ;
        for(String word : words)
        {
           if(word.replaceAll("["+allowed+"]", "")=="")
           {
              count++;
           }
        }
        System.out.println(count);
        
    }
}