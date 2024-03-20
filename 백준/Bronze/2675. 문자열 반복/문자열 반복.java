import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int cnt = Integer.parseInt(br.readLine());
			for(int i = 0 ; i < cnt ; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int rep = Integer.parseInt(st.nextToken());
				String s = st.nextToken();
				for(int j = 0 ; j < s.length() ; j++) {
					bw.write(String.valueOf(s.charAt(j)).repeat(rep)); 
				}
				bw.write("\n");
				bw.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}