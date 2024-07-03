import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {    
    public static void main(String[] args) {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        
        try {
        	int cases = Integer.parseInt(br.readLine());
        	for(int i = 0 ; i < cases ; i++) {
        		long n = Long.parseLong(br.readLine());
        		if(n==0 || n==1) {
        			System.out.println(2);
        			continue;
        		}
        		while(true) {
        			int cnt = -1;
        			for(long j = 1 ; j <= Math.sqrt(n) ; j++) {
        				if(n % j ==0 ) cnt++;
        				if(cnt>0) break;
        			}
        			if(cnt>0) n++;
        			else {
        				System.out.println(n);
        				break;
        			}
        		}
		
        	}
        	
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}