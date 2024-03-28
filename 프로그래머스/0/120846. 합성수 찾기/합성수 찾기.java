class Solution {
    public int solution(int n) {
		int answer = 0 ;
		for(int i = 1; i <= n ; i++) {
			if(check(i)) answer++;
		}
        return answer;
    }
    public boolean check(int n) {
		int cnt = 0;
		for(int i = 1; i <= Math.sqrt(n) ; i++) {
			if(n%i==0) {
				cnt++;
			} 
			if(cnt>=2) return true;
		}		
		return false;
	}
}