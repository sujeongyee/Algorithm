
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {    
    public static void main(String[] args) {        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        
        try {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	StringTokenizer st2 = new StringTokenizer(br.readLine());
        	
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	int c = Integer.parseInt(st2.nextToken());
        	int d = Integer.parseInt(st2.nextToken());
        	
        	int n = a*d + b*c;
        	int n2 = b*d;
        	int gcd= getGcd(Math.max(n, n2),Math.min(n, n2));
        	     	
        	
        	System.out.println(n/gcd+" "+n2/gcd);
        	
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
    public static int getGcd(int a, int b) {
    	if(a%b == 0) {
    		return b;
    	}else {
    		return getGcd(b,a%b);
    	}
    }
}