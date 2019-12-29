import java.util.Scanner;
public class Anagrams
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Please enter a string:");
        String s1 = new String(sc.nextLine());
        System.out.println ("Please enter a second string:");
        String s2 = new String(sc.nextLine());
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        sc.close();
        boolean isAnagram = true;
        
        char [] letters1 = s1.toCharArray();
        char [] letters2 = s2.toCharArray();
        
        for (int i = 0; i < letters1.length; i++)
        {
            if (Character.isLetter(letters1[i]) == false)
            {
                letters1[i] = '0';
            }
        }
        
        for (int i = 0; i < letters2.length; i++)
        {
            if (Character.isLetter(letters2[i]) == false)
            {
                letters2[i] = '0';
            }
        }

        for (int i = 0; i < letters1.length; i++)
        {
            if (letters1[i] != 0)
            {
                for (int j = 0; j < letters2.length; j++)
                {
                    if (letters1[i] == letters2[j])
                    {
                        letters2[j] = '0';
                        letters1[i] = '0';
                        break;
                    }
                }
            }
        }
        
        for (int i = 0; i < letters1.length; i++)
        {
            if (letters1[i] != '0')
            {
                isAnagram = false;
                break;
            }
        }
    System.out.println ("Are these strings are anagrams? - " + isAnagram);
    }
}
