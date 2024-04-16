import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] arr = br.readLine().split(" ");
			int first = Integer.parseInt(arr[0]);
			int plus = first;
			int cnt = 0;
			for(int i = 1 ; i < arr.length ; i++) {
				if(first==1 && Integer.parseInt(arr[i])-1==plus) {
					cnt++;
					plus++;
				}else if(first==8 && Integer.parseInt(arr[i])+1==plus) {
					cnt++;
					plus--;
				}else {
					System.out.println("mixed");
					break;
				}
			}
			if(cnt==7) {
				if(plus==8) System.out.println("ascending");
				else System.out.println("descending");
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}