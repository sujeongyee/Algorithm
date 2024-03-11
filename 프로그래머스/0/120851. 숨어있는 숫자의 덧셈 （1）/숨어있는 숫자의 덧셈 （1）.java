class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]", "");
		int answer = 0;
		for(char a:my_string.toCharArray()) {
			answer+=(a-48);			
		}
        return answer;
    }
}