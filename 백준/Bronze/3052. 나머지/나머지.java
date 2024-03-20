import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		Set<Integer> set = new HashSet<>();
		try {
			for(int i = 0; i< 10 ; i++) {
				set.add(Integer.parseInt(br.readLine())%42);
			}
			System.out.println(set.size());
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}