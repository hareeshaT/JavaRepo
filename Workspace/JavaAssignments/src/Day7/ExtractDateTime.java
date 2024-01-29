package Day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtractDateTime {

	public static void main(String[] args) throws ParseException {
		String dateString = "2023-08-30 15:45:30"; 
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = dateFormat.parse(dateString);

        SimpleDateFormat dateOnlyFormat = new SimpleDateFormat("yyyy-MM-dd");
        String extractedDate = dateOnlyFormat.format(date);
        System.out.println("Extracted Date: " + extractedDate);
        SimpleDateFormat timeOnlyFormat = new SimpleDateFormat("HH:mm:ss");
        String extractedTime = timeOnlyFormat.format(date);
        System.out.println("Extracted Time: " + extractedTime);
	}

}