//todo           1523. Count Odd Numbers in an Interval Range
// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/

public class leetcode23
{
    public static void main(String[] args) 
    {
         int low = 0;
         int high = 1000000000 ;
         if(low%2!=1)
         {
            low = low + 1 ;
         }
         int count = 0 ;
         for(int i = low ; i<=high ; i=i+2)
         {
                count++;  
         }
         System.out.println(count);
    }
}