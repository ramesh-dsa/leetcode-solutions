//todo     2469. Convert the Temperature
// https://leetcode.com/problems/convert-the-temperature/description/

public class leetcode22
{
    public static void main(String[] args) 
    {

        double celsius = 36.50;
        //! Given
        // Kelvin = Celsius + 273.15
        // Fahrenheit = Celsius * 1.80 + 32.00

        System.out.println(" Kelvin :  "+celsius+273.15);
        System.out.println("Fahrenheit : "+ (double)(celsius * 1.80) + 32.00);
    }
}