import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] test = new int[1000]; 
		test[0] = n;
		int idx = 1;
		while(n!=1) {
			if(n%2==0) n/=2;
			else n=n*3+1;
			test[idx] = n;
			idx++;
		}
		int[] answer = Arrays.copyOfRange(test, 0, idx);
        return answer;
    }
}