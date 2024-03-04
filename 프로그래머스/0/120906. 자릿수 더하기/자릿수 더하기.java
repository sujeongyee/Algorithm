class Solution {
    public int solution(int n) {
        String[] arr = (n+"").split("");        
		int answer = 0; 
		for (String s : arr) {
			answer+=Integer.parseInt(s);
		}
        return answer;
    }
}