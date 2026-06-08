//todo          1773. Count Items Matching a Rule
// https://leetcode.com/problems/count-items-matching-a-rule/description/

import java.util.Arrays;

public class leetcode16
{
    public static void main(String[] args) 
    {
        String[][] items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};   
        String ruleKey = "color" ; 
        String  ruleValue = "silver" ;

        int output = 0 ;
        for(String item[] : items)
        {
             if(ruleKey == "type" && ruleValue ==item[0])
             {
                output++;
             }
             else if(ruleKey == "color" && ruleValue == item[1])
             {
                output++;
             }
             else if(ruleKey == "name" && ruleValue == item[2])
             {
                output++;
             }
        }
        System.out.println(output);
        System.out.println(Arrays.deepToString(items)); 
    }
}