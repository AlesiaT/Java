/*
 This program determines the amount of days for each month of year.
 
 Author: Alesia Tratsiakova, student number: 19252470.
 */


public class StudentNo19252470
{
    public static void main(String args [])
    {
    	// Declare variables
    	int year = 1900;
    	String month = "February";
    	
    	// Determine amount of days and print the data on the screen
    	switch (month)
    	{
    		case "January": case "March": case "May":
    		case "July": case "August": case "October":
    		case "December":
    		{
    			System.out.println("In " + month + " " + year + " there were 31 days"); break;
    		}
    		case "April": case "June": case "September":
    		case "November":
    		{
    			System.out.println("In " + month + " " + year + " there were 30 days"); break;
    		}
    		case "February":
    		{
    			if ((year % 4) == 0)
    			{
    				 if ((year % 100) == 0)
    				 {
    				 	if ((year % 400) == 0)
    				 	{
    						System.out.println("In " + month + " " + year + " there were 29 days");
    				 	}
    				 	else
    				 	{
    				 		System.out.println("In " + month + " " + year + " there were 28 days");
    				 	}
    				 }
    				 else
    				 {
    				 	  	System.out.println("In " + month + " " + year + " there were 29 days");
    				 } 
    			}
    			else
    			{
    				System.out.println("In " + month + " " + year + " there were 28 days");
    			}
    			break;
    		}
    		default:
    		{
    			System.out.println("Invalid values"); break;
    		}
    	}
    }
}
