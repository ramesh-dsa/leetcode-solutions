//todo           468. Validate IP Address
// https://leetcode.com/problems/validate-ip-address/description/

public class leetcode19
{
    public static void main(String[] args) {
        String queryIP = "256.256.256.256" ;
     if(queryIP.contains("."))
      {
        String[] vs = queryIP.split("\\.",-1);
        boolean check1 = true ;
        if(vs.length==4)
        {
            for(String v : vs )
        {
            if((v.matches("[0-9]+")) && v.length() >= 1 && v.length() <= 3 )
            {
                if((Integer.parseInt(v)>=0 && Integer.parseInt(v)<=255 ))
                {
                    if(v.contains("0"))
                    {
                        if(v.matches("0\\d+"))
                        {
                            check1 = false ;
                            break ;
                        }
                    }
                }
                else
                {
                    check1 = false ;
                    break ;
                }
            }
            else
            {
                check1 = false ;
                break ;
            }
            
        }
        if(check1)
        {
            System.out.println(("IPv4"));
            return ;
        }
        }
        
      } 

      if(queryIP.contains(":"))
      {
          String[] vss = queryIP.split(":",-1);
          boolean check2 = true ;
          if(vss.length==8)
          {
              for(String vs1 : vss)
                {
                    if(vs1.length()>=1 && vs1.length()<=4)
                    {
                        if(vs1.matches("[a-fA-F0-9]+"))
                        {

                        }
                        else
                        {
                            check2  = false ;
                            break ;
                        }

                    }
                    else
                    {
                        check2 = false ;
                        break ;
                    }
        }
        if(check2)
        {
            System.out.println( ("IPv6"));
            return;
        }
          }
        
      }
        System.out.println("Neither ");
    }
}