public class Palindrome
{
    public static void main(String args[])
    {
        String str = new String("Was it a car or a cat I saw?");
        str = str.toLowerCase();
        String newStr = new String("");
        boolean isPal = true;
        for (int i = 0; i < str.length(); i++)
        {
            if (Character.isLetter(str.charAt(i)))
            {
                newStr = newStr + str.charAt(i);
            }
        }
        
        for (int i = 0; i < newStr.length()/2; i++)
        {
            if (newStr.charAt(i) != newStr.charAt(newStr.length() - 1 - i))
            {
                isPal = false;
                break;
            }
        }
        System.out.println(isPal);
    }
}
