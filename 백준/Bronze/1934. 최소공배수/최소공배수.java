import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {    
    public static void main(String[] args) {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        
        try {
        	int cases = Integer.parseInt(br.readLine());
        	for(int i = 0 ; i < cases ; i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		int a = Integer.parseInt(st.nextToken());
        		int b = Integer.parseInt(st.nextToken());
        		int n = 1;
        		for(int j = 2; j<= Math.min(a, b) ; j++) {
        			if(a%j==0 && b %j ==0) {
        				n= j;
        			}
        		}
        		System.out.println(n*(a/n)*(b/n));
        		
        	}
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}