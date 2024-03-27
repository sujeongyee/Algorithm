class Solution {
    public String solution(int age) {
        String s = Integer.toString(age);
		String answer = "";
		for(int i = 0 ; i < s.length() ; i++) {
			answer+=(char)(s.charAt(i)+49);
			
		}
        return answer;
    }
}