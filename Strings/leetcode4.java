//todo      2114. Maximum Number of Words Found in Sentences
// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/

public class leetcode4
{
    public static void main(String[] args) 
    {
        String[] sentences = { "alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max = 0 ;
        for(String sentence : sentences)
            {
                String[] count = sentence.split(" ");
                max = Math.max(max,count.length);
            }  
        System.out.println(max);  
    }
}