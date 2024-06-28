import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int f = Integer.parseInt(br.readLine());
			
			n = n-(n%100);
			String s = "";
			if(n % f ==0) s =String.valueOf(n);
			else {
				s = String.valueOf(f*(n/f+1)); 
			}
			System.out.println(s.substring(s.length()-2,s.length() ));
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}