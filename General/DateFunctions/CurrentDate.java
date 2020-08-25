package DateFunctions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println("Current Date:"+date.toString());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println("Date after format" + dateFormat.format(date));

	}

}
