//todo        https://leetcode.com/problems/next-greater-element-i/description/

/*
     class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0 ; i<nums1.length ; i++)
        {
           int index = -1;
           for (int k = 0; k < nums2.length; k++) {
                if (nums2[k] == nums1[i]) {
                    index = k;
                    break;
                }
            }
            int max = nums1[i] ; 

            for(int j = index+1 ; j<nums2.length ; j++)
            {
                if(max < nums2[j])
                {
                    max = nums2[j];
                    break ; 
                }
            }
            if(max == nums1[i])
            {
                ans[i] = -1 ;
            }
            else
            {
                ans[i] = max ;
            }
        }
        return ans ; 

    }
}
*/