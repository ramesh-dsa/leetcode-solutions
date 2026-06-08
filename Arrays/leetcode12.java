// todo    1662. Check If Two String Arrays are Equivalent
// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

public class leetcode12
{
    public static void main(String[] args) 
    {
        String[] word1 = {"ab", "c"}; 
        String[] word2 = {"a", "bc"};
        
        //String str =String.join("",word1);
        System.out.println(String.join("",word1).equals(String.join("",word2)));
    }
}