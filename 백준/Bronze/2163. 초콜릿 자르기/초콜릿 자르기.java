import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			String[] arr = s.split(" ");
			System.out.println(Integer.parseInt(arr[0])*Integer.parseInt(arr[1])-1);
						
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}