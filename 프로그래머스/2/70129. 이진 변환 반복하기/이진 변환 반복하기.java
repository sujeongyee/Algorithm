
class Solution {
    public int[] solution(String s) {
		int zero = 0;
		int cnt = 0;
		while(!s.equals("1")) {
			cnt++;
			int len = s.length();
			s = s.replace("0", "");
			zero += len-s.length();
			s = Integer.toBinaryString(s.length());
		}
        return new int[]{cnt,zero};
    }
}