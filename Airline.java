import java.util.Scanner;

public class Airline
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        
        String code = new String ("");
        String airline = new String ("");
        String number = new String ("");
        
        while (code.equals("END") == false)
        {
            System.out.println ("Please enter an airline code:");
            code = sc.nextLine();
            boolean valid = true;
            
            if (code.equals("END") == false)
            {
                if (code.length() > 6)
                {
                    valid = false;
                }
                
                for (int i = 0; i < code.length(); i++)
                {
                    if (i <= 1 && Character.isLetter(code.charAt(i)) == false)
                    {
                        valid = false;
                    }
                    else if (i > 1 && Character.isDigit(code.charAt(i)) == false)
                    {
                        valid = false;
                    }
                }
                
                airline = code.substring(0,2);
                if (airline.equals("EI"))
                {
                    airline = "Aer Lingus";
                }
                else if (airline.equals("FR"))
                {
                    airline = "Ryanair";
                }
                else if (airline.equals("AF"))
                {
                    airline = "Air France";
                }
                else if (airline.equals("AA"))
                {
                    airline = "American Airlines";
                }
                else if (airline.equals("IB"))
                {
                    airline = "Iberia";
                }
                else
                {
                    valid = false;
                }
                
                number = code.substring(2);
                
                if (valid)
                {
                    System.out.print ("Airline: " + airline);
                    System.out.println (" - Flight Number: " + number);
                }
                else
                {
                    System.out.println ("Invalid flight code.");
                }
            }
        }
        sc.close();
    }
}
