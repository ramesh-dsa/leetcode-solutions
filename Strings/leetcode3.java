//todo   28. Find the Index of the First Occurrence in a String
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public class leetcode3
{
    public static void main(String[] args) {

       String  haystack = "mississippi";
       String needle = "issip" ;

       //! this code gives output false but expected is true 
    //    int i = 0 ;
    //    int j = 0 ;

    //    int count = 0 ; 

    //    while(j<haystack.length())
    //    {
    //         if(haystack.charAt(j)==needle.charAt(i))
    //         {
    //           i++;
    //           j++;
    //           count++;
    //           System.out.println("j from if "+j);
    //           System.out.println("i from if "+ i);   
    //         }
    //         else
    //         {
               
    //            i=0; 
    //            count = 0 ;
    //            j++;
    //            System.out.println("j from else "+j);
    //            System.out.println("i from else "+ i); 
    //         }
    //         System.out.println("checking");
    //         if(count==needle.length())
    //         {
    //             System.out.println(true);
    //             return ;
    //         }
    //    }
    //    System.out.println(false);

    //! learned from gemini when i got error he said this ..... 
    int check = haystack.indexOf(needle);
    System.out.println(check!=-1);

    }
}