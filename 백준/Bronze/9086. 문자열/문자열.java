import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i = 0 ; i < n ; i++) {
				String s = br.readLine();
				bw.write(s.charAt(0)+""+s.charAt(s.length()-1)+"\n");
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}