package Day7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

	public static void main(String[] args) {
	        // Get the current date and time
	        LocalDateTime currentDateTime = LocalDateTime.now();

	        // Define the desired date-time format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	        // Format the current date and time using the formatter
	        String formattedDateTime = currentDateTime.format(formatter);

	        // Print the formatted date and time
	        System.out.println("Current Date and Time: " + formattedDateTime);
	    }
}
