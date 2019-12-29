public class Car
{
    private double efficiency;
    private double fuelLevel;
    private double capacity;
    
    public Car(double eff, double cap)
    {
        efficiency = eff;
        fuelLevel = 0;
        capacity = cap;
    }
    
    public void drive(double kms)
    {
        if (fuelLevel >= efficiency * kms)
        {
            fuelLevel -= efficiency * kms;
        }
        else
        {
            System.out.println ("You haven't got enough fuel");
        }
    }
    
    public double get_fuel()
    {
        return fuelLevel;
    }
    
    public void add_fuel(double litres)
    {
        fuelLevel += litres;
        if (fuelLevel > capacity)
        {
            fuelLevel = capacity;
        }
    }
}
