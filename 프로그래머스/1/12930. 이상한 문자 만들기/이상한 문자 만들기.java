class Solution {
    public String solution(String s) {
       String answer = "";
		
		int count = 0;
		
		for(int i = 0 ; i < s.length() ; i++) {

			if(s.charAt(i)==' ') {
				count = 0;
				answer+=" ";
			}else {
				answer += (count % 2 == 0) ? Character.toUpperCase(s.charAt(i)) : Character.toLowerCase(s.charAt(i));
				count++;
			}
		}
        return answer;
    }
}