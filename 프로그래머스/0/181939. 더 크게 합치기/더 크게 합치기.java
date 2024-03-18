class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
		sb.append(Integer.toString(a)).append(Integer.toString(b));
		StringBuilder sb2 = new StringBuilder();
		sb2.append(Integer.toString(b)).append(Integer.toString(a));
		int answer = Math.max(Integer.parseInt(sb.toString()), Integer.parseInt(sb2.toString()));
        return answer;
    }
}