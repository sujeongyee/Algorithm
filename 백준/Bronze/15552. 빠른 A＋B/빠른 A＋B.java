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
			while(true) {
				int cnt = Integer.parseInt(br.readLine());
				for(int i = 0 ; i < cnt ; i++) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					bw.write(Integer.toString( Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");					
				}
				bw.flush();
			}				
		} catch (Exception e) {			
		}						
	}
}