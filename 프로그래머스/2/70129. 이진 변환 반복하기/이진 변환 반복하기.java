class Solution {
    public int[] solution(String s) {
        int count = 0;
		int zero = 0;
		while(!s.equals("1")) {
			int len = s.length();		
			int len2 = s.replaceAll("0", "").length();
			zero+=(len-len2);
			count++;
			s = Integer.toBinaryString(len2);
		}
		int[] answer = {count,zero};
        return answer;
    }
}