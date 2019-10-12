/* This program will break up the digits of a 5-digit number into its component parts.
We take a modulus of number divided by 10.
Then we divide the number by 10.
Then repeat these steps again and again until job is done*/

public class ComponentsOf5digitNumber
{
    public static void main(String args[])
    {
        // Declare the values
        int number = 48295;
        int theFirstDigit = 0, theSecondDigit = 0, theThirdDigit = 0, theForthDigit = 0, theFifthDigit = 0;
        
        // Extract the last digit
        theFifthDigit = number % 10;
        
        // Extract the others digits
        number = number / 10;
        theForthDigit = number % 10;
        
        number = number / 10;
        theThirdDigit = number % 10;
        
        number = number / 10;
        theSecondDigit = number % 10;
        
        theFirstDigit = number / 10;
        
        // Write down the result
        System.out.println("The firts digit of number is: " + theFirstDigit);
        System.out.println("The second digit of number is: " + theSecondDigit);
        System.out.println("The third digit of number is: " + theThirdDigit);
        System.out.println("The forth digit of number is: " + theForthDigit);
        System.out.println("The fifth digit of number is: " + theFifthDigit);
    }
    
}