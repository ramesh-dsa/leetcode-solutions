//todo         1413. Minimum Value to Get Positive Step by Step Sum
// https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/description/?envType=problem-list-v2&envId=prefix-sum

public class leetcode2
{
    public static void main(String[] args) {

        int[] nums = {1,-2,-3};
        int[] prefixSum = new int[nums.length];

        for(int i = 1 ; i<=10 ; i++)
        {
            boolean check = true ;
            int gtr = nums[0] + i ;
            System.out.println("The value is "+gtr);

            if(gtr > 0 )
            {
                prefixSum[0] = gtr ;
                 for(int j = 1 ; j<nums.length ; j++)
                 {
                     prefixSum[j] = prefixSum[j-1] + nums[j];
                     if(prefixSum[j]<=0)
                        {
                            System.out.println("False at : "+j);
                            check = false ;
                            break ;
                        } 
                 }
                 System.out.println("outside loop");
                 if(check)
                {
                    System.out.println(i);
                    return ;
                }
            }
            
            System.out.println("done at : "+ i);
        }
    }
}