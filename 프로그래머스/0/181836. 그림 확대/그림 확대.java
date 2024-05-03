class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
		
		for(int i = 0 ; i < picture.length ; i++) {
			StringBuilder sb = new StringBuilder();
			String a = picture[i];
			for(char c : a.toCharArray()) sb.append(String.valueOf(c).repeat(k));
			for(int j = i*k; j< (i*k)+k ; j++) {
				answer[j] = sb.toString();
			}
		}
        return answer;
    }
}