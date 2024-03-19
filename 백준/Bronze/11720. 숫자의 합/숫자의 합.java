import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			br.readLine();
			String s = br.readLine();
			int sum = 0;
			for(char c:s.toCharArray()) {
				sum+= (c-48);
			}
			System.out.println(sum);
						
		} catch (Exception e) {			
		}						
	}
}