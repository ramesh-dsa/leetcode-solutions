// todo    1108. Defanging an IP Address
//  https://leetcode.com/problems/defanging-an-ip-address/description/

public class leetcode9
{
    public static void main(String[] args) 
    {
       String address = "1.1.1.1" ;
       address =  address.replace(".","[.]") ;   
       System.out.println(address);
      // System.out.println(changed);
    }
}