import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {	
	static int[] times;
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String word = br.readLine();
			int[] arr = new int[26]; 
			for(char c : word.toCharArray()) {
				arr[c-97]++;						
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0 ; i < arr.length ; i++) {
				sb.append(arr[i]);
				if(i!=arr.length-1) sb.append(" ");
			}
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}