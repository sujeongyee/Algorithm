class Solution {
    public int solution(int n) {
        int answer = 1;
		int cnt = 1;
		
		while(cnt<=n) {
			if(answer%3!=0 && !(String.valueOf(answer).contains("3"))) { // 조건에 안 부합할때
				if(cnt==n)break;
				answer++;
				cnt++;
			}else {
				answer++;
			}
		}
        return answer;
    }
}