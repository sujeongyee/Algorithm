import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int a = Integer.parseInt(br.readLine());
			String b = br.readLine();
			System.out.println(a*Integer.parseInt(Character.toString( b.charAt(2))) );
			System.out.println(a*Integer.parseInt(Character.toString( b.charAt(1))) );
			System.out.println(a*Integer.parseInt(Character.toString( b.charAt(0))) );
			System.out.println(a*Integer.parseInt(b));
		} catch (Exception e) {
			
		}
    }
}