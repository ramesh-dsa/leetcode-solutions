//todo      557. Reverse Words in a String III
// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

public class leetcode21
{
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest" ;
        String words[] = s.split(" ");

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder(); 

       
        for(String word : words)
        {
            sb.append(word) ; 
            System.out.println(sb);
            sb1.append(" "+sb.reverse());
            System.out.println(sb1);

            sb.delete(0,word.length());
        }

        String str = sb1.toString();
        System.out.println(str.trim());

        
    }
}