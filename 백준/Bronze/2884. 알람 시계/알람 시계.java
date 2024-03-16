import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int hour = Integer.parseInt(st.nextToken());
			int minute = Integer.parseInt(st.nextToken()); 			
			if(minute>=45) {
				System.out.println(hour + " " + (minute-45));
			}else {
				hour = hour==0? hour+=24:hour;
				System.out.println((hour-1) + " " +(minute+60-45));
			}
		} catch (Exception e) {			
		}						
	}
}
