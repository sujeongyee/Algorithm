import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		try {
			int n = Integer.parseInt(br.readLine());
			int n2 = 1;
			while(true) {
				int n3 = n2;
				int sum = n3;
				while(n3!=0) {
					sum+= n3%10;
					n3/=10;
				}
				if(sum == n) {
					System.out.println(n2);
					break;
				}
				n2++;
				if(n2>n) {
					System.out.println(0);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}