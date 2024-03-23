import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			int cnt = Integer.parseInt(br.readLine());
			for(int i = 0 ; i < cnt ; i++) {
				System.out.println(vps(br.readLine()));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public static String vps(String s) {
		Stack<String> stack = new Stack<>();
		
		for(int i = 0 ; i < s.length() ; i++) {
			String ss = String.valueOf(s.charAt(i));
			if(ss.equals("(")) stack.push("(");
			else {
				if(stack.size()==0) return "NO";
				stack.pop();
			}			
		}
		if(stack.size()>0) return "NO";
		return "YES";
	}
}
