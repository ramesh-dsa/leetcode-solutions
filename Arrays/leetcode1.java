import java.util.Arrays;
public class leetcode1{
    public static void main(String[] args) {

        
        String s = "anagram";
        String t = "nagaram";

        if(s.length()==t.length())
        {
            char[] as = s.toCharArray();
            char[] at = t.toCharArray();

            Arrays.sort(as);
            Arrays.sort(at);
            
            System.out.println(Arrays.equals(as,at));
            return ;
        }
        System.out.println(false);
    }
}