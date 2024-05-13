class Solution {
    public int[] solution(int[][] score) {
        double[] avg = new double[score.length];
		for(int i = 0 ; i < score.length ; i++) {
			avg[i] = (double)(score[i][0]+score[i][1])/2;
		}
		int[] answer = new int[avg.length];
		for(int i = 0 ; i < avg.length ; i++) {
			int cnt = 0;
			for(int j = 0 ; j < avg.length ; j++) {
				if(avg[j]>avg[i]) cnt++;
			}
			answer[i] = cnt+1;
		}
        return answer;
    }
}