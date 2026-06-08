//todo    2011. Final Value of Variable After Performing Operations
// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/

public class leetcode8
{
    public static void main(String[] args) 
    {
          String[] operations = {"X++","++X","--X","X--"};
          int output = 0 ;
          
          for(String operation : operations)
          {
            if(operation.charAt(1)=='+')
            {
                output++;
            }
            else
            {
                output--;
            }
          }
          System.out.println(output);
    }
}