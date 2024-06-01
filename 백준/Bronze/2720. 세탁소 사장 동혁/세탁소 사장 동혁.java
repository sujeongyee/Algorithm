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
				int n = Integer.parseInt(br.readLine());
				bw.write(n/25+" ");
				n-=(n/25)*25;
				bw.write(n/10+" ");
				n-=(n/10)*10;
				bw.write(n/5+" ");
				n-=(n/5)*5;
				bw.write(String.valueOf(n/1)+"\n");
			}
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
