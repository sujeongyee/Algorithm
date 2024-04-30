import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {	
	static int[] times;
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s;
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}