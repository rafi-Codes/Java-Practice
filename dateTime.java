import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateTime{
	public static void main (String[] args){
		Date localDate = new Date();
		LocalTime nowTime = LocalTime.now();
		DateFormat dateformater = new SimpleDateFormat("dd/MM/YYYY");
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println(dateformater.format(localDate));
		System.out.println(nowTime.format(timeFormat));
	}
}