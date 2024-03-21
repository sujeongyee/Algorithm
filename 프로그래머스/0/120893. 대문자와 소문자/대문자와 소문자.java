class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < my_string.length() ; i++) {
			char c = my_string.charAt(i);
			if(c+0>=97) sb.append(String.valueOf(c).toUpperCase());
			else sb.append(String.valueOf(c).toLowerCase());
		}
        return sb.toString();
    }
}