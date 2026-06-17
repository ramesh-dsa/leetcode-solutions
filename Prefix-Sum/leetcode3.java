import java.util.Arrays;

public class leetcode3
{
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        int[] prefixSum = new int[nums.length];

        prefixSum[0] = nums[0];
        // prefix sum array 
        for(int i = 1 ; i < prefixSum.length ; i++)
        {
            prefixSum[i] = prefixSum[i-1] + nums[i] ;
        }
        System.out.println(Arrays.toString(prefixSum));

        // leftSum array 
        int[] leftSum = new int[nums.length];
        leftSum[0] = 0 ;
        for(int i = 1 ; i < leftSum.length ; i++)
        {
            leftSum[i] = prefixSum[i-1] ; 
        }
        System.out.println(Arrays.toString(leftSum));

        // Right Sum array 
        int[] rightSum = new int[nums.length];
        for(int i = 0 ; i < nums.length ;i++ )
        {
            rightSum[i] = prefixSum[nums.length - 1 ] - prefixSum[i];
        }
        System.out.println(Arrays.toString(rightSum));

        // Now we are using the prefixSum as final Array 
        for(int i = 0 ; i < nums.length ; i++)
        {
            prefixSum[i] = Math.abs(leftSum[i] - rightSum[i] );
        }
        System.out.println(Arrays.toString(prefixSum));
    }
}