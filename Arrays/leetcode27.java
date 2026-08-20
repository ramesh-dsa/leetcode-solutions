//todo       https://leetcode.com/problems/three-consecutive-odds/

/*
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0 ; 
        for(int i = 0 ; i<arr.length ; i++){
            if(count == 3 )
            {
                return true ; 
            }
            else if(arr[i]%2 == 1 ){
                count++;
            }
            else{
                count = 0 ; 
            }
        }
        return count==3 ;
    }
}
*/