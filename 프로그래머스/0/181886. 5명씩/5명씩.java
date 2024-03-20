class Solution {
    public String[] solution(String[] names) {
        int len = names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1 ;
		
		String[] answer = new String[len];
		
		int idx = 0;
		
		for(int i = 0 ; i < names.length ; i+=5) {
			answer[idx] = names[i];
			idx++;
		}
        return answer;
    }
}