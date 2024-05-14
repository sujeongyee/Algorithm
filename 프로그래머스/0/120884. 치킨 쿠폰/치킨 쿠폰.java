class Solution {
    public int solution(int chicken) {
        int cnt = 0;
		while(true) {
			if(chicken/10<1) break;
			cnt += chicken/10;
			chicken = chicken-(10*(chicken/10))+(chicken/10);
		}
        return cnt;
    }
}