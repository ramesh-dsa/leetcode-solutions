
import java.util.Arrays;

public class leetcode5
{
    public static int[] plusOne(int[] digits)
    {
        for(int i = (digits.length - 1) ; i>=0 ; i--)
        {
             if(digits[i]<9)
             {
                digits[i]++ ;
                return digits ;
             }
             digits[i] = 0 ;
        }
        
            int[] arr = new int[digits.length+1];
            arr[0] = 1 ;
            return arr ;
        
            //! long size ku work aagathu ... 
        // long sum = 0 ;
        // for(int digit:digits)
        // {
        //     sum = sum*10 + digit ;
        //     System.out.println(sum);
        // }
        // sum = sum + 1 ;
        // String str = Long.toString(sum);
        // int newdigit[] = new int[str.length()];
        // for(int i = 0 ; i<str.length() ; i++)
        // {
        //     // from google 
        //     newdigit[i] = Character.getNumericValue(str.charAt(i));
        // }   
        // return newdigit;
    }
    public static void main(String[] args)
    {
        int[] digits = {5,2,2,6,5,7,1,9,0,3,8,6,8,6,5,2,1,8,7,9,8,3,8,4,7,2,5,8,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}