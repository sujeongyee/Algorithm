class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
		
		for(int i = 0 ; i < indices.length ; i++) {
			sb.deleteCharAt(indices[i]);
			sb.insert(indices[i], "A");
		}
		String answer = sb.toString().replace("A", "");
        return answer;
    }
}