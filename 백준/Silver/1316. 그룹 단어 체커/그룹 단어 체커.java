import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			int cnt = Integer.parseInt(br.readLine());
			int answer = 0;
			for(int i = 0 ; i < cnt ; i++) {
				String s = br.readLine();
				if(check(s)) answer++;
			}
			System.out.println(answer);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public static boolean check(String s) {
		
		String[] arr = s.split("");
		String prev = "";
		String you = "";
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i].equals(prev)) {
				continue;
			}else {
				prev = arr[i];
				if(you.contains(arr[i])) {
					return false;
				}else {
					you+= arr[i];
				}				
			}
		}
		
		return true;
	}
}