import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {    
    public static void main(String[] args) {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        
        try {
        	StringTokenizer st = new StringTokenizer(br.readLine());
    		long a = Integer.parseInt(st.nextToken());
    		long b = Integer.parseInt(st.nextToken());
    		System.out.println(a*b/euclidean(Math.max(a, b),Math.min(a, b)));

        	
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
    public static long euclidean (long a, long b) {
    	if(a%b==0) {
    		return b;
    	}
    	return euclidean(b,a%b);
    } 
}