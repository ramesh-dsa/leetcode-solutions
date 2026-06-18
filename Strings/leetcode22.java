//todo          1678. Goal Parser Interpretation
// https://leetcode.com/problems/goal-parser-interpretation/description/

public class leetcode22

{
    public static void main(String[] args) {
        String  command = "G()(al)" ;
        command = command . replace("()","o");
        command = command . replace("(","") . replace(")","");
        System.out.println(command);
    }
}