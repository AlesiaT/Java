public class MultiplicationTable {
    public static void main(String args[]) {
        System.out.print ("  |");
        for (int num1 = 1; num1 <= 6; num1++)
        {
            System.out.print ("  " + num1);
        }
        System.out.println ();
        System.out.println ("----------------------");
        
        for (int num1 = 1; num1 <= 6; num1++)
        {
            System.out.print (num1 + " |");
            for (int num2 = 1; num2 <= 6; num2++)
            {
                if (num1*num2/10 == 0)
                {
                    System.out.print ("  " + num1*num2);
                }
                else
                {
                    System.out.print (" " + num1*num2);
                }
            }
            System.out.println ();
        }

    }
}