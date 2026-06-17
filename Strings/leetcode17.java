//todo         2678. Number of Senior Citizens
// https://leetcode.com/problems/number-of-senior-citizens/description/

public class leetcode17
{
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int count = 0 ;
        for(String detail : details)
        {
            if(Integer.valueOf(detail.substring(12,14))>60)
            {
                count++;
            }
            System.out.println(Integer.valueOf(detail.substring(11,13)));
        }
        System.out.println(count);
    }
}