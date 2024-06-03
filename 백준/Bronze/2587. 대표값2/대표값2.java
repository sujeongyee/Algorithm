
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			int[] arr = new int[5];
			int sum = 0;
			for(int i = 0 ; i < arr.length ;i++) {
				int a = Integer.parseInt(br.readLine());
				arr[i] = a;
				sum+=a;
			}
			Arrays.sort(arr);
			
			System.out.println(sum/5);
			System.out.println(arr[2]);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
