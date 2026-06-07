// todo  167. Two Sum II - Input Array Is Sorted
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

import java.util.Arrays;

public class leetcode3
{
    public static void main(String[] args)
    {
       int[] numbers = {-10,-8,-2,1,2,5,6};
       int target = 0 ;

            int i = 0 ; 
            int j = numbers.length - 1  ;

            while(i<j)
            {
               int  sum = numbers[i] + numbers[j] ;
                if(sum==target)
                {
                    System.out.println(Arrays.toString(new int[]{i+1,j+1}));
                    break;
                }
                else if(sum<target)
                {
                    i++;
                }
                else
                {
                    j--;
                    System.out.println(j);
                }
            }
    }
}