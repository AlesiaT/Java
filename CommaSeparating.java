import java.util.Scanner;
public class CommaSeparating
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number >= 1000 and <= 1000000:");
        String num = new String(sc.nextLine());
        String newNum = new String(num.substring(num.length() - 3, num.length()));
        sc.close();
        
        for (int i = num.length() - 3; i > 2; i -=3)
        {
            newNum = num.substring(i-3,i) + "," + newNum;
        }
        if (num.length()%3 != 0)
        {
            newNum = num.substring(0,num.length()%3) + "," + newNum;
        }
        System.out.println(newNum);
    }
}
