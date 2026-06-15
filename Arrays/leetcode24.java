//todo      2418. Sort the People
// https://leetcode.com/problems/sort-the-people/description/

/*
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int j = 0 ;
        for(int i = 0 ; i < names.length-1 ; i++)
        { 
            int maximum = heights[i];
            int index = i ; 
            for( j = i + 1 ; j < names.length ; j++)
            {
                if(maximum<heights[j])
                {
                    maximum = heights[j] ;
                    index = j ; 
                }
            }
            if(index!=i)
            {
                int temp = heights[i];
            //    System.out.println(index);
                heights[i] = heights[index] ; 
                heights[index] = temp ; 
                String change = names[i] ; 
                names[i] = names[index] ; 
                names[index] = change ;
            }
          //  System.out.println(Arrays.toString(names));
          //  System.out.println(Arrays.toString(heights));

        }
        return names ;
    }
}
*/