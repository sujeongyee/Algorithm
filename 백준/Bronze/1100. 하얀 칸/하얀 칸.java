import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int cnt = 0;
			for(int i = 0 ; i < 8 ; i++) {
				String[] arr = br.readLine().split("");
				for(int j = 0 ; j < arr.length ; j++) {
					if(i%2==0 && j%2 ==0 && arr[j].equals("F")) cnt++;
					if(i%2!=0 && j%2 !=0 && arr[j].equals("F")) cnt++;
				}
			}
			System.out.println(cnt);
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
