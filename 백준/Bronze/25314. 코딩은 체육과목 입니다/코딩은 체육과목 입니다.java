import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			System.out.println("long ".repeat(n/4)+"int");
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
