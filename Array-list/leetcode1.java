//todo         1480. Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/


//todo Solved Using ArrayList 

import java.util.ArrayList;
import java.util.Arrays;
public class leetcode1
{
    public static void main(String[] args) {

        Integer nums[] = {3,1,2,10,1};

        //! Convert array into arraylist 
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(nums));

        for(int i = 1 ; i<numbers.size();i++)
        {
           numbers.set(i,numbers.get(i)+numbers.get(i-1));
        }

        System.out.println("Summed list : "+numbers);
    }
}

//todo  Using only array method 

// import java.util.Arrays;
// public class leetcode1
// {
//     public static void main(String[] args) {
        
//         int nums[] = {3,1,2,10,1};
//         for(int i =1 ; i<nums.length ; i++)
//         {
//             nums[i] = nums[i] + nums[i-1];
//         }

//         System.out.println(Arrays.toString(nums));

//     }
// }

