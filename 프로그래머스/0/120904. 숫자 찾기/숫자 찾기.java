class Solution {
    public int solution(int num, int k) {
        String num2  = Integer.toString(num);
		String k2 = Integer.toString(k);
		int answer = -1;
		for(int i = 0 ; i < num2.length() ; i++) {
			if(String.valueOf(num2.charAt(i)).equals(k2)) {
				answer = i+1;
				break;
			}
		}
        return answer;
    }
}