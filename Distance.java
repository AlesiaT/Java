public class Distance 
{
    public static void main(String args[])
    {
        int[] a = {1,2,3};
        int[] b = {3,2,1};
        double sumSquared = 0;

        for (int i=0; i<a.length; i++)
        {
            sumSquared += Math.pow((a[i] - b[i]),2);
        }
        
        double distance = Math.sqrt(sumSquared);
        System.out.println (distance);
    }
}
