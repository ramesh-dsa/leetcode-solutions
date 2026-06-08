//todo                771. Jewels and Stones
// https://leetcode.com/problems/jewels-and-stones/description/

public class leetcode5
{
    public static void main(String[] args) {

        String jewels = "z";
        String stones = "ZZ" ;

        stones = stones.replaceAll("[^"+jewels+"]","");
        System.out.println(stones.length());
    }
}