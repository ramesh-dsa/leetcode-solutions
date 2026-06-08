//todo   2283. Check if Number Has Equal Digit Count and Digit Value
// https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/description/

public class leetcode14
{
    public static void main(String[] args) {
        String  num = "030" ;
        String[] nums = num.split("") ;

        for(int i = 0 ; i<nums.length ;i++ )
        {
           int count = 0 ;
           String find = ""+i;
           int times = Integer.valueOf(nums[i]);
             
           for(String check : nums)
           {
            if(find.equals(check))
            {
                count++;
            }
           }
           if(count!=times)
           {
            System.out.println(false);
            return;
           }
        }
        System.out.println(true);
    }
}