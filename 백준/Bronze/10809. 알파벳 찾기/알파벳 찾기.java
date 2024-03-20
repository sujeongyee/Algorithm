import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		for(int i = 0 ; i < arr.length ; i++) arr[i] = -1;
		try {
			String s = br.readLine();
			for(int i = 0 ; i < s.length() ; i++) {
				if(arr[s.charAt(i) - 97] == -1) arr[s.charAt(i) - 97] = i;				
			}
			StringBuilder sb = new StringBuilder();
			for(int a : arr) sb.append(a).append(" ");
			System.out.println(sb.toString().trim());
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}