import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i = 0 ; i < n ; i++) {
				String s = br.readLine();
				String[] arr = s.split(",");
				System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]) );
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}