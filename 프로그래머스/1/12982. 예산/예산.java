import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
		int answer = 0;
		for(int i = 0 ; i < d.length ; i++) {
			budget-=d[i];			
			if(budget<0) break;
			else answer++;
		}
        return answer;
    }
}