class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
		for(int i = 1 ; i < food.length ; i++) {
			answer.append(Integer.toString(i).repeat(food[i]/2));
		}
		StringBuilder sb = new StringBuilder(answer);
		answer.append("0");
		answer.append(sb.reverse());
        return answer.toString();
    }
}