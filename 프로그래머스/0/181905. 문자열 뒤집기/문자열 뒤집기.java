class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb2 = new StringBuilder(my_string.substring(0,s));
		StringBuilder sb = new StringBuilder(my_string.substring(s, e+1));
		StringBuilder sb3 = new StringBuilder(my_string.substring(e+1, my_string.length()));
		sb.reverse();
		sb2.append(sb);
		sb2.append(sb3);
        return sb2.toString();
    }
}