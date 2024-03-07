import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
		int n = 10;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]!=n) stack.push(arr[i]);
			n=arr[i];
		}	

        return stack.stream().mapToInt(i->i).toArray();
    }
}