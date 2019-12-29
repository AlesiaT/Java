import java.util.Scanner;
public class CarSimulator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car(0.5, 40.0);
        int command = 0;
        
        while (command != 3)
        {
            System.out.println ("Enter a command: 1 for drive, 2 for adding fuel, 3 for exit");
            command = sc.nextInt();
            switch (command)
            {
                case 1: System.out.println ("Enter a number of kilometers (double):"); c1.drive(sc.nextDouble()); break;
                case 2: System.out.println ("Enter a number of litres of fuel (double):"); c1.add_fuel(sc.nextDouble()); break;
                case 3: break;
                default: System.out.println ("Invalid input");
            }
        }
    }
}
