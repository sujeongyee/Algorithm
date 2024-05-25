class Solution {
    public int[] solution(int num, int total) {
        int start = num % 2 != 0 ? (total / num)-(num / 2) : (total / num) - (num /2 - 1);
		
		int[] answer = new int[num];
		
		for(int i = start ; i < start + num ; i++) {
			answer[i-start] = i;
		}
        return answer;
    }
}