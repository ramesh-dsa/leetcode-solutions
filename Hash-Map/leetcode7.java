//todo        3945. Digit Frequency Score
// https://leetcode.com/problems/digit-frequency-score/description/

/*
class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n!=0)
        {
            int lastdigit = n % 10 ;
            map.put(lastdigit,map.getOrDefault(lastdigit,0)+1);
            n = n / 10 ;
        }
        int sum = 0 ;
        for(Integer key : map.keySet())
        {
            sum = sum + key*( map.get(key) );
        }
      //  System.out.println(map) ;
        return sum ;
    }
}
*/