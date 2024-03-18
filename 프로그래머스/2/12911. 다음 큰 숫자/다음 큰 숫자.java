class Solution {
    public int solution(int n) {
        String s = Integer.toBinaryString(n);
		int len = s.length();
		int len2 = s.replace("1", "").length();
		int one = len-len2;
		int answer = 0;
		while(true) {
			n++;
            s = Integer.toBinaryString(n);
			len = s.length();
			len2 = s.replace("1", "").length();
			if(one==(len-len2)) {
				answer=n;
				break;
			}
		}
        return answer;
    }
}