import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); 
		    int b = Integer.parseInt(st.nextToken()); 
		    StringBuilder sb = new StringBuilder();
		    for(int i = 0 ; i < a ; i++) {
			    String c = st2.nextToken();
			    if (Integer.parseInt(c)< b) {
				    sb.append(c).append(" ");
			    }
		    }		
		    sb.deleteCharAt(sb.length()-1);
		    System.out.println(sb.toString());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}