class Solution {
    public int solution(String A, String B) {
        StringBuilder sb = new StringBuilder(A);
		if(A.equals(B)) return 0;
		int cnt = 0;
		while(true) {
			cnt++;
			char s =  sb.charAt(A.length()-1);
			sb.insert(0, s);
			sb.deleteCharAt(A.length());
			if(sb.toString().equals(B)) {
				return cnt;
			}
			if(cnt == (A.length())) break;
		}
		return -1;
    }
}