import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {	
	public static void main(String[] args) {		
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");		
		String answer = dateFormat.format(now);
		System.out.println(answer);	
	}
}