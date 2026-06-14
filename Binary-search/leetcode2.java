//todo     2089. Find Target Indices After Sorting Array
// https://leetcode.com/problems/find-target-indices-after-sorting-array/description/?envType=problem-list-v2&envId=binary-search

/*
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
         List<Integer> result = new ArrayList<>();

        // 1. Array-ah sort panniduvom
        Arrays.sort(nums);
        
        // 2. Orey oru single while loop
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == target) {
                result.add(i); // Matching index straight-ah add aagidum
            }
            i++; // Pointer next value-ku move aagum
        }
        
        return result;
    }
}
*/