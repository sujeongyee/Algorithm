class Solution {
    public int solution(int n, int m, int[] section) {
        int prev = section[0];
		int cnt = 1;
		for(int i = 1 ; i < section.length ; i++) {
			if(!(prev+m>section[i])) {
				cnt++;
				prev = section[i];				
			}
		}
        return cnt;
    }
}