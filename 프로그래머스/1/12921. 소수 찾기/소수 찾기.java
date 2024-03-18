class Solution {
    public int solution(int n) {
        int cnt = 1;
		for(int i = 1; i <= n ; i+=2 ) {
			if(i==1) continue;
			int cnt2 = 0;
			for(int j = 2 ; j <= Math.sqrt(i); j++) {
				if(i%j==0) {
					cnt2++;
					break;
				}
			}
			if(cnt2==0) cnt++;		
		}
        return cnt;
    }
}