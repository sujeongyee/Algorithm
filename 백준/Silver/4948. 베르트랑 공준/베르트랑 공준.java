import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {    
    public static void main(String[] args) {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        
        try {
        	while(true) {
        		int n = Integer.parseInt(br.readLine());
        		if(n==0) break;
        		int cnt = 0;
        		for(int i = n+1 ; i <= 2*n ; i++) {
        			int cnt2 = 0;
        			for(int j = 2; j <= Math.sqrt(i) ; j++) {
        				if(i%j==0) {
        					cnt2++;
        					break;
        				}
        			}
        			if(cnt2==0) cnt++;
        		}
        		System.out.println(cnt);
        	}
        	
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}