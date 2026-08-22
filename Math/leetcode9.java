//todo    https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/description/?envType=daily-question&envId=2026-08-22

/*
class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0 ; 
        int product = 1 ; 
        int temp = n ;
    
        while(n!=0){
            sum+= n%10 ;
            product*= n%10 ;
            n=n/10;
        }
       return (temp%(sum+product)== 0 );
    }
}
*/