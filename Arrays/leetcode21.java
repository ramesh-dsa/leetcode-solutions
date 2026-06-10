//todo      1822. Sign of the Product of an Array
// https://leetcode.com/problems/sign-of-the-product-of-an-array/description/

public class leetcode21
{
    public static void main(String[] args) 
    {
        int[] nums = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};  
        
        int count = 0 ;
        for(int num : nums)
        {
            if(num==0)
            {
                System.out.println(0);
                return ;
            }
            else if(num<0)
            {
                count++;
            }
        }
        if(count%2==1)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(1);
        }
    }
}