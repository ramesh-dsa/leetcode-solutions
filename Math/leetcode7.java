public class leetcode7
{
  public static void main(String[] args) {
    int num = 2560;
    String strnum = String.valueOf(num) ;

         if(num==0)
        {
            System.out.println(true);  
            return ;
        }
  
    if((strnum.charAt(strnum.length()-1) =='0'))
    {
        System.out.println(false);
        return;

    }

    System.out.println(true);
     
  }
}