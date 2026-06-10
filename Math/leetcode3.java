//todo          1486. XOR Operation in an Array
// https://leetcode.com/problems/xor-operation-in-an-array/description/

public class leetcode3
{
    public static void main(String[] args) 
    {
        int n = 4 ;
        int start = 3 ;
        int output = 0 ;
        int nums[] = new int[n];
        for(int i = 0 ; i<n ; i++)
        {
            nums[i] = start + 2*i;
            output = output ^ nums[i] ;
        }
        System.out.println(output);
        // System.out.println(Arrays.toString(nums));

        

    }
}