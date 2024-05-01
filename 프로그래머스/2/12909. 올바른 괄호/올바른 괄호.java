import java.util.Stack;
class Solution {
    boolean solution(String s) {
        if(s.length()%2!=0) return false;
        char[] arr = s.toCharArray();
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == '(') {
				stack.push(1);
			}else {
				if(stack.size()==0) {
					return false;
				}else {
					stack.pop();
				}
			}
		}
		if(stack.size()==0) return true;
        else return false;
    }
}