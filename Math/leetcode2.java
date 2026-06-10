//todo  1281. Subtract the Product and Sum of Digits of an Integer
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/

public class leetcode2
{
    public static void main(String[] args) 
    {
         int n = 4421 ; 

         int product = 1 ;
         int sum = 0 ;
         while(n!=0)
         {
            product = product * (n%10) ;
            sum = sum + (n%10);
            n = n / 10 ;
         }
         System.out.println(product-sum);
    }
}