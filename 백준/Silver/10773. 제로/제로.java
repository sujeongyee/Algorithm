import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int cnt = Integer.parseInt(br.readLine());
			Stack<Integer> stack = new Stack<Integer>();
			for(int i = 0 ; i < cnt ; i++) {
				int n = Integer.parseInt(br.readLine());
				if(n==0) {
					stack.pop();
				}else {
					stack.push(n);
				}				
			}
			int sum = 0;
			for(int a : stack) sum+=a;
			System.out.println(sum);			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
