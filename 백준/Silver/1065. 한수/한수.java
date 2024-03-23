import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			int num = Integer.parseInt(br.readLine());
			int answer = 0;
			for(int i = 1 ; i <= num ; i++) {
				if(i<100) {
					answer++;
				}else {
					if(check(i)) answer++;
				}				
			}
			System.out.println(answer);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public static boolean check(int i) {
		String num = Integer.toString(i);
		String[] arr = num.split("");
		int cha = Integer.parseInt(arr[1])-Integer.parseInt(arr[0]);
		for(int j = 2 ; j < arr.length ; j++) {
			int c = Integer.parseInt(arr[j])-Integer.parseInt(arr[j-1]);
			if(c!=cha) {
				return false;
			}
		}		
		return true;
	}
}