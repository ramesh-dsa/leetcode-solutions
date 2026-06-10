//todo          2413. Smallest Even Multiple
// https://leetcode.com/problems/smallest-even-multiple/description/

public class leetcode4
{
    public static void main(String[] args) {
        int n = 77 ;

        for(int i = 2 ; i<=Integer.MAX_VALUE ; i++)
        {
            if(i%2==0 &&  i%n==0)
            {
                System.out.println(i);
                return ;
            }
        }
        System.out.println();
    }
}