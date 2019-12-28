import java.util.Scanner;
public class WithoutCommas
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number >= 1000:");
        String num = new String(sc.nextLine());
        sc.close();
        
        for (int i = 0; i < num.length(); i++)
        {
            if (num.charAt(i) == ',')
            {
                num = num.substring(0,i) + num.substring(i+1);
            }
        }
        System.out.println(num);
    }
}
