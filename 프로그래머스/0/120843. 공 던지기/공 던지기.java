class Solution {
    public int solution(int[] numbers, int k) {
        int cnt = 1;
		int idx = 0;
		int now = numbers[0];
		while(cnt<k) {
			if(idx+2>= numbers.length)idx-=numbers.length;
			idx+=2;
			now = numbers[idx];
			cnt++;
		}
        return now;
    }
}