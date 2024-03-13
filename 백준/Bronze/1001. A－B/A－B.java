import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
			String a = br.readLine();
			String[] arr = a.split(" ");
			int answer = Integer.parseInt(arr[0])-Integer.parseInt(arr[1]);
			System.out.println(answer);
		} catch (Exception e) {
			
		}
					
	}
}