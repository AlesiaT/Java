import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("To convert from Celsius to Fahrenheit enter 1 and to convert from Fahrenheit to Celsius enter 2: ");
        int conversion = sc.nextInt();
        int degreesCelsius, degreesFahrenheit;
        switch (conversion)
        {
            case 1: System.out.println ("Enter a temperature: ");
            degreesCelsius = sc.nextInt();
            degreesFahrenheit = (9*(degreesCelsius)/5)+32;
            System.out.println (degreesFahrenheit); 
            break;
            case 2: System.out.println ("Enter a temperature: ");
            degreesFahrenheit = sc.nextInt();
            degreesCelsius = 5*(degreesFahrenheit-32)/9;
            System.out.println (degreesCelsius); 
            break;
            default: System.out.println ("Invalid input");
        }
    }
}
