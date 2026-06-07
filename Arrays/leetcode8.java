// todo 1342. Number of Steps to Reduce a Number to Zero
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

public class leetcode8
{
    public static void main(String[] args) {
        int num = 123 ;
        int output = 0 ;
        while(num!=0)
        {
            num = (num%2==0)? (num = num / 2) : (num = num-1) ;
            output++;
        }
        System.out.println(output);
    }
}