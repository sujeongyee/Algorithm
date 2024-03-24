import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			int[] arr = new int[201];
			br.readLine();
			String s = br.readLine();
			int num = Integer.parseInt(br.readLine());
			
			String[] arr2 = s.split(" ");
			
			for(int i = 0 ; i < arr2.length ; i++) {
				arr[Integer.parseInt(arr2[i])+100]++;
			}
			System.out.println(arr[100+num]);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}	
}