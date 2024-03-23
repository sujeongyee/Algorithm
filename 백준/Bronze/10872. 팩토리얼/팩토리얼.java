import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int num = Integer.parseInt(br.readLine());
			if(num==0) System.out.println(1);
			else {
				long fac = 1;
				for(int i = num ; i >= 1 ; i--) {
					fac*=i;
				}
				System.out.println(fac);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}						
	}	
}