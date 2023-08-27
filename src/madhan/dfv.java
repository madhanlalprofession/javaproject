package madhan;
import java.util.*;

public class dfv {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the total salary paid to Justin: ");
	        double totalSalary = scanner.nextDouble();
	        
	        // Assuming Justin earns $10 per hour
	        double hourlyRate = 10.0;
	        
	        // Calculate the total number of hours worked
	        double totalHoursWorked = totalSalary / hourlyRate;
	        
	        // Calculate the number of weekend hours
	        double weekendHours = totalHoursWorked / 3;
	        
	        // Calculate the number of weekday hours (10 more than weekend hours)
	        double weekdayHours = weekendHours + 10;
	        
	        System.out.println("Number of weekday hours is " + weekdayHours);
	        System.out.println("Number of weekend hours is " + weekendHours);
	        
	        scanner.close();
	    }
	}



