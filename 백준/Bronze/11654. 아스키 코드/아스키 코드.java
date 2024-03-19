import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			char c = br.readLine().charAt(0);
			System.out.println(c+0);			
		} catch (Exception e) {
		}						
	}
}