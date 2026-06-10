//todo  1313. Decompress Run-Length Encoded List
// https://leetcode.com/problems/decompress-run-length-encoded-list/description/

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode18
{
    public static void main(String[] args) 
    {
         int[] nums = {65,44,72,15};   

         ArrayList<Integer> decompressed = new ArrayList<>();
         for(Integer i = 1 ; i <nums.length ; i=i+2)
         {
            int freq = nums[i-1];
            for( int j = 0 ; j<freq ;j++)
            {
               decompressed.add(nums[i]);
               System.out.println((decompressed));
            }
            System.out.println("Done");
         }
         int[] output = new int[decompressed.size()];
         for(int i = 0 ; i<output.length ;i++)
         {
            output[i] = decompressed.get(i);
         }
         System.out.println(Arrays.toString(output));
    }
}