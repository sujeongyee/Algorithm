import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		try {
			int cnt = Integer.parseInt(br.readLine());
			Stack<Integer> stack = new Stack<>();
			StringBuilder sb = new StringBuilder();
			for(int i = 0 ; i < cnt ; i++) {
				String s = br.readLine();
				switch(s) {
					case "size" : sb.append(stack.size()).append("\n");
						break;
					case "empty" : sb.append(stack.empty()?1:0).append("\n");
						break;
					case "top" : sb.append(stack.empty()?-1:stack.peek()).append("\n");
						break;
					case "pop" : sb.append(stack.empty()?-1+"\n":stack.pop()+"\n");
						break;
					default : stack.push(Integer.parseInt(s.split(" ")[1]));
				}
			}
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}	
}