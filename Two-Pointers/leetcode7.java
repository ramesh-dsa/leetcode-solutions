//todo               88. Merge Sorted Array
//https://leetcode.com/problems/merge-sorted-array/description/

import java.util.Arrays;
public class leetcode7
{
   public static void main(String[] args) {
    int[] nums1 = {1,2,3,0,0,0}; 
    int m = 3; 
    int[] nums2 = {2,5,6} ;
    int n = 3 ;

    if(n==0)
    {
        System.out.println(Arrays.toString(nums1));
        return ;
    }

    int arr1 = m-1 ;
    int arr2 = n-1 ;
    int[] arr = new int[nums1.length];
    int len = nums1.length - 1 ;
    
    while( arr1!=-1 && arr2!=-1)
    {
        if(nums1[arr1]<nums2[arr2])
        {
            arr[len] = nums2[arr2];
            arr2--;
        }
        else
         {
            arr[len] = nums1[arr1];
            arr1--;
         }
         len--;
         System.out.println(Arrays.toString(arr));
    }
    while(arr1 >= 0)
    {
        arr[len] = nums1[arr1];
        arr1--;
        len--;
    }

    while(arr2 >= 0)
    {
        arr[len] = nums2[arr2];
        arr2--;
        len--;
    }

    System.out.println(Arrays.toString(arr));
    nums1=arr;
    System.out.println(Arrays.toString(nums1));
    
   }
}