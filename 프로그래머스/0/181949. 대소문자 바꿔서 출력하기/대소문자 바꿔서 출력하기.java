import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			StringBuilder sb = new StringBuilder();
			
			for(char c : s.toCharArray()) {
				if( c-0 >=97 && c-0<=122) sb.append(String.valueOf(c).toUpperCase());
				else sb.append(String.valueOf(c).toLowerCase());
			}
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}		
    }
}