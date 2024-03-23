import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int cnt = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sosu = 0;
			for(int i = 0 ; i < cnt ; i++) {
				int num = Integer.parseInt(st.nextToken());
				if(num>1 && checkPrime(num)) sosu++;
			}
			System.out.println(sosu);
		} catch (Exception e) {
			e.printStackTrace();
		}						
	}
	public static boolean checkPrime(int num) {
		int count = 0;
		for(int i = 2; i<=Math.sqrt(num) ; i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0) return true;
		else return false;
	}
}