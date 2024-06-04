import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			int[] arr = new int[3];
			int[] arr2 = new int[3];
			
			int a = 0;
			int b = 0;
			
			for(int i = 0 ; i < 3 ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				arr[i] = Integer.parseInt(st.nextToken());
				arr2[i] = Integer.parseInt(st.nextToken());		
			}
			
			if(arr[0]==arr[1]) a = arr[2];
			else if(arr[0] == arr[2]) a = arr[1];
			else a = arr[0];
			
			if(arr2[0]==arr2[1]) b = arr2[2];
			else if(arr2[0] == arr2[2]) b = arr2[1];
			else b = arr2[0];
			
			System.out.println(a + " " + b);
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
