import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
			for(int i = 0 ; i < arr.length ; i++) {
				s=s.replaceAll(arr[i], "a");
			}
			System.out.println(s.length());
		} catch (Exception e) {
			e.printStackTrace();
		}						
	}	
}
