public class PrintFactors
{
    public static void main (String args[])
        {
            int num = 12;
            System.out.print ("The factors of " + num + " are 1");
            for (int count = 2; count <= num; count++)
            {
                if (num % count == 0 & count != num)
                {
                    System.out.print(", " + count);
                }
                else if (count == num)
                {
                    System.out.print(" and " + count);
                }
                else
                {

                }
            }
        }

}
