import java.util.Arrays;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] result = new int[k];
		for(int i = 0 ; i < k; i++) result[i]=2000;
		int[] answer = new int[score.length];
		for(int i = 0 ; i < score.length ; i++) {
			if(i<k) {
				result[i] = score[i];
				Arrays.sort(result);
				answer[i] = result[0];
			}else {
				Arrays.sort(result);
				if(result[0]<score[i]) result[0]=score[i];
				Arrays.sort(result);
				answer[i] = result[0];
			}
		}
        return answer;
    }
}