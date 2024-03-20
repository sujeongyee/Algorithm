import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		try {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());			
			long mul = a*b*c;
			String s = String.valueOf(mul);
			for(int i = 0 ; i < s.length() ; i++) {
				arr[s.charAt(i)-48]++;
			}
			for(int n : arr) System.out.println(n);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}