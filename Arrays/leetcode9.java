//todo    1732. Find the Highest Altitude
// https://leetcode.com/problems/find-the-highest-altitude/description/

public class leetcode9
{
    public static void main(String[] args) 
    {
       int[] gain = {52,-91,72} ;
       int max = 0 ;
       max = Math.max(max,gain[0]);
       for(int i = 1 ; i<gain.length ;i ++)
       {
           gain[i] = gain[i] + gain[i-1];
           max = Math.max(max,gain[i]);
       }
       System.out.println(max);
       
    }
}