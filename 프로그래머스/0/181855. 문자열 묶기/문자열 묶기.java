class Solution {
    public int solution(String[] strArr) {
        int[] cnt = new int[31];
		for(String s : strArr) {
			cnt[s.length()]++;
		}
		int answer = 0;
		for(int n : cnt) {
			if(answer<n) answer = n;
		}
        return answer;
    }
}