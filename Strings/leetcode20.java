//todo             344. Reverse String
// https://leetcode.com/problems/reverse-string/description/

import java.util.Arrays;
public class leetcode20
{
    public static void main(String[] args) {
       char[] s = {'h','e','l','l','o'} ; 
        StringBuilder sb = new StringBuilder(String.copyValueOf(s));
        String str =  sb.reverse() .toString() ;
        s = str.toCharArray();
        System.out.println(str);
        System.out.println(Arrays.toString(s));
    }
}