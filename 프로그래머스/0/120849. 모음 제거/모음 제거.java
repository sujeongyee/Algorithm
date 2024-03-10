class Solution {
    public String solution(String my_string) {
        String[] mo = {"a", "e", "i", "o", "u"};
		String answer = my_string;
		for(String s : mo) {
			answer = answer.replaceAll(s, "");
		}
        return answer;
    }
}