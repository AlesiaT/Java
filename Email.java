public class Email
{
    public static void main(String args[])
    {
        String name = new String ("mickey mouse 2012");
        String newName = new String ("");
        for (int i = 0; i < name.length(); i++)
        {
            if (name.charAt(i) == ' ')
            {
                int firstletter = ++i;
                newName = name.substring(0,firstletter - 1) + ".";
                for (i = i; i < name.length(); i++)
                {
                    if (name.charAt(i) == ' ')
                    {
                        newName = newName + name.substring(firstletter, i) + "." + name.substring(i+1) + "@nuim.ie";
                        break;
                    }
                }
                break;
            }
        }
        System.out.println(newName);
    }
}
