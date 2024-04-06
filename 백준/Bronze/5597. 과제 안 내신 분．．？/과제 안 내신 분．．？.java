import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		try {
			int[] arr = new int[31];
			for(int i = 0 ; i < 28; i++) {
				arr[Integer.parseInt(br.readLine())]++;
			}
			for(int i = 1 ; i < arr.length ; i++) {
				if(arr[i]==0) System.out.println(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}