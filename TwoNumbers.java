// This program
// - determines which of 2 number are bigger and which are smaller;
// - deternimes is numbers are odd or even;
// - prints out all numbers between two given.
public class TwoNumbers
{
    public static void main (String args [])
    {
        // Declare variables
        int num1 = 43;
        int num2 = 28;
        int biggerNum = 0, smallerNum = 0;

        // Determine which number are bigger
        if (num1 > num2)
        {
            biggerNum = num1;
            smallerNum = num2;
            System.out.println (num1 + " is bigger than " + num2);
        }
        else
        {
            biggerNum = num2;
            smallerNum = num1;
            System.out.println (num2 + " is bigger than " + num1);
        }

        // Determine if numbers odd or even
        if ((num1 % 2) == 0 & (num2 % 2) == 0)
            System.out.println (num1 + " and " + num2 + " are both even");
        else if ((num1 % 2) == 0 & (num2 % 2) != 0)
            System.out.println (num1 + " is even and " + num2 + " is odd");
        else if ((num1 % 2) != 0 & (num2 % 2) == 0)
            System.out.println (num1 + " is odd and " + num2 + " is even");
        else
            System.out.println (num1 + " and " + num2 + " are both odd");

        // Write down all numbers between given
        for (int i = smallerNum; i <= biggerNum; i++)
            System.out.println (i);

    }
}