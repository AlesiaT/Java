import java.util.Scanner;
public class VovelsCounter
{
    public static void main(String args[])
    {
        System.out.println("Please enter a string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int vovA = 0, vovO = 0, vovI = 0, vovE = 0, vovU = 0, vovTotal = 0, notVov = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (Character.isLetter(str.charAt(i)))
            {
                switch (str.charAt(i))
                {
                    case 'a': vovA++; break;
                    case 'o': vovO++; break;            
                    case 'i': vovI++; break;
                    case 'e': vovE++; break;
                    case 'u': vovU++; break;
                    default: notVov++; break;
                }
            }
        }
        
        vovTotal = vovA + vovO + vovI + vovE + vovU;
        
        System.out.println("The number of vovels is: " + vovTotal);
        System.out.println("The number of vovels A is: " + vovA);
        System.out.println("The number of vovels O is: " + vovO);
        System.out.println("The number of vovels I is: " + vovI);
        System.out.println("The number of vovels E is: " + vovE);        
        System.out.println("The number of vovels U is: " + vovU);
        System.out.println("The number of non-vovels is: " + notVov);
    }
}
