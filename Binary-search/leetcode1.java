//todo             704. Binary Search
// https://leetcode.com/problems/binary-search/description/?envType=problem-list-v2&envId=binary-search

/*

class Solution {
    public int search(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length - 1 ; 
        while(start<=end)
        {
            int mid = (start + end) / 2 ;
            if(target == nums[mid] )
            {
                return mid;
            }
            else if(target < nums[mid])
            {
                end = mid - 1 ;
            }
            else
            {
                start = mid + 1 ;
            }
        }
        return -1 ;

    }
}
*/