
//todo       1832. Check if the Sentence Is Pangram
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

import java.util.HashSet;
public class leetcode12 
{
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        if(sentence.length()<26)
        {
            System.out.println(false);
            return ;
        }
        for(char ch : sentence.toCharArray())
        {
                set.add(ch);   
        }

        System.out.println(set.size()==26);
        
    }
}