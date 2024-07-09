class Solution {
    public int solution(String s) {
        char letter = ' '; 
		int idx = 0;
		int idx2 = 0;
		int cnt = 0;
		int cnt2 = 0;
		int answer = 0;
		for(char c : s.toCharArray()) {
			idx2++;
			if(idx==0) letter = c;
			if(letter==c) cnt++;
			else cnt2++;
			idx++;
			if(cnt==cnt2) {
				answer++;
				idx = 0;
				cnt = 0;
				cnt2 = 0;
			}
			if(idx2==s.length() && cnt!=cnt2) answer++;
		}	
        return answer;
    }
}