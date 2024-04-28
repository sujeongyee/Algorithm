import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {				
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int cases = Integer.parseInt(br.readLine());
			for(int i = 0 ; i < cases ; i++) {
				int a = (cases-1)*2+1;
				int b = i*2+1;
				bw.write(" ".repeat((a-b)/2)+"*".repeat(b)+"\n");
			}
			for(int i = cases-2 ; i>=0 ; i--) {
				int a = (cases-1)*2+1;
				int b = i*2+1;
				bw.write(" ".repeat((a-b)/2)+"*".repeat(b)+"\n");
			}
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
