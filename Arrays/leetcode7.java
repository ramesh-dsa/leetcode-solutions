//todo             1295. Find Numbers with Even Number of Digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class leetcode7
{
    public static void main(String[] args)
    {
       int[] nums = {12,345,2,6,7896};
       int output = 0 ;
       for(int num : nums )
        {
           int count = 0 ;
           while(num!=0)
           {
            num = num / 10 ;
            count++;
           }
           if(count%2==0)
           {
            output++;
           }
        } 
        System.out.println(output);
    }
}