import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) {		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			int a = Integer.parseInt(s);
			if(a>=90) {
				System.out.println("A");
			}else if (a>=80) {
				System.out.println("B");
			}else if(a>=70) {
				System.out.println("C");
			}else if(a>=60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		} catch (Exception e) {
			
		}					
	}
}
