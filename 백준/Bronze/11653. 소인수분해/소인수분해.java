import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		try {					
			int n = Integer.parseInt(br.readLine());
			
			while(n!=1) {
				for(int i  = 2 ; i <= n ; i++) {
					if(n%i==0) {
						list.add(i);
						n/=i;
						break;
					}
				}
			}
			list.stream().sorted().forEach(i-> System.out.println(i));
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
