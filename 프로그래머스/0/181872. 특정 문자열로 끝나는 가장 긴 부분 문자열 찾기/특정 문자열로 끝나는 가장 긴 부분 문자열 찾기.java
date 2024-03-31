class Solution {
    public String solution(String myString, String pat) {
        int a = myString.lastIndexOf(pat);
		String answer = myString.substring(0,(a+pat.length()));
        return answer;
    }
}