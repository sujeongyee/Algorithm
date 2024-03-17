import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int b = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
				System.out.println(b);
			}				
		} catch (Exception e) {			
		}						
	}
}
