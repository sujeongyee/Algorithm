class Solution {
    public int solution(int n) {
        int answer = 0;
		for(int i = 10 ; i>=0 ; i--) {
			if(n>=fac(i)) {
				answer = i;
				break;
			}
		}
        return answer;
    }
    public int fac(int n) {
		if(n==0) return 0;
		int sum = 1;
		for(int i = 1 ; i <= n ; i++) {
			sum*=i;
		}
		return sum;
	}
}