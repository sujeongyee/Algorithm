import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			String s = br.readLine();
			s = s.trim();
			int answer = s.length()-s.replace(" ","").length()+1;
			if(answer == 1 && s.equals("")) System.out.println("0");
			else System.out.println(answer);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}