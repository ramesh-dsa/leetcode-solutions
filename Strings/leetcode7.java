//todo           657. Robot Return to Origin
// https://leetcode.com/problems/robot-return-to-origin/description/

public class leetcode7
{
    public static void main(String[] args) 
    {
        String moves = "UD";
        int hor = 0 ;
        int vert = 0 ;
        for(char move : moves.toCharArray())
        {
            if(move=='U')
            {
                vert = vert + 1; 
            }
            else if(move=='D')
            {
                vert =  vert - 1 ;
            }
            else if(move=='L')
            {
                hor = hor - 1 ;
            }
            else
            {
                hor = hor + 1 ;
            }
        }
        System.out.println(hor==0 && vert==0);
    }
}