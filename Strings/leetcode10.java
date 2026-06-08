//todo               1528. Shuffle String
// https://leetcode.com/problems/shuffle-string/description/

public class leetcode10
{
    public static void main(String[] args) 
    {
       String  s = "codeleet";
       int[] indices = {4,5,6,7,0,2,1,3};
       char[]  scarr = s.toCharArray();
       for(int i = 0 ; i <scarr.length ; i++)
       {
        scarr[indices[i]] = s.charAt(i);
       }
       System.out.println(new String(scarr));
    }
}
